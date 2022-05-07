package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import model.CityData;
import model.DatiPanel;
import view.BuildFrame;
import view.Frame;
import view.Panel;
import view.WarningFrame;

public class InterControl extends Thread implements ActionListener{
	private Panel dati;
	private CityData cityData;
	private DatiPanel datiPanel;
	private long startTime;
	private DateTimeFormatter format;
	private Frame frame;
	private BuildListener buildListener;
	private BuildFrame buildFrame;
	private DatiCitta datiCitta;
	
	public InterControl(Frame frame,BuildFrame bf) {
		cityData = new CityData(LocalDateTime.now());
		datiPanel = new DatiPanel();
		startTime = System.currentTimeMillis();
		this.frame = frame;
		this.dati = frame.getPannello();
		this.start();
		datiCitta = new DatiCitta(10000);
		format = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
		dati.getLblHour().setText(cityData.getDay().format(format));
		buildFrame = bf;
		buildListener = new BuildListener(this,frame,cityData);
		dati.btnPanelListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == dati.getBtnBuild() ) {
			
			BuildFrame b = new BuildFrame();
			buildListener.setListener(b);
			b.setVisible(true);
			
		}else if(e.getSource() == dati.getBtnWarnings()) {
			
			WarningFrame w = new WarningFrame();
			w.build();
		}
		
	}
	private boolean dateChange() {
		long elapsedTimeSec = (System.currentTimeMillis()-startTime)/1000;
		
		if(elapsedTimeSec>30) {
			cityData.setDay(cityData.getDay().plusDays(1));
			dati.getLblHour().setText(cityData.getDay().format(format));
			startTime = System.currentTimeMillis();
			return true;
		}
		return false;
	}
	public void run() {
		
		while(true) {
			
			if(dateChange()) {
				String s = "New day";
				dati.getTextField().setText(s);
				int traffic = (int) (datiPanel.getNumeroAbitanti()/((2*cityData.getTrainStationsNum()+2*cityData.getAirportsNum())+30));
				int crime = (datiPanel.getNumeroAbitanti()/20)-cityData.getPoliceStationsNum();
				int pollution = (int) (datiPanel.getNumeroAbitanti()/10+1.5*cityData.getFactoriesNum());
				int satisfaction = Math.max((int) (datiPanel.getNumeroAbitanti()-2*crime-1.5*pollution-traffic+2*cityData.getAirportsNum()+2*cityData.getCasinoNum()+2*cityData.getSupermarketsNum()+1.5*cityData.getPoliceStationsNum()),0);
				dati.setTraffic(traffic+"%");
				dati.setCrime(crime+"%");
				dati.setPollution(pollution+"%");
				dati.setPplSatis(satisfaction+"%");
				double mK = (datiPanel.getNumeroAbitanti()*(satisfaction-2*crime-1.5*pollution-traffic+2*cityData.getCasinoNum())/70);
				dati.getLblProgressBar().setValue((int) (datiPanel.getNumeroAbitanti()*(satisfaction-2.5*crime-2.5*pollution-2.5*traffic)/70));
				if(satisfaction>50) {
					s += " \n stai andando bene";
				}else if(mK>=100 ) {
					s += " \n hai raggiunto il massimo di voti,continua cosi :)";
				}else s += " \n impeganti di piu";
				
				dati.getTextField().setText(s);
				if(cityData.getHousesNum()>0) {
					moneyLogic(cityData.getHousesNum()*500);

				}
				if(cityData.getCasinoNum()>0) {
					moneyLogic(cityData.getCasinoNum()*700);
				}
				if(cityData.getAirportsNum()>0) {
					moneyLogic(cityData.getAirportsNum()*2000);
				}
				if(cityData.getPoliceStationsNum()>0) {
					moneyLogic(cityData.getPoliceStationsNum()*500);
				}
				if(cityData.getArcadesNum()>0) {
					moneyLogic(cityData.getArcadesNum()*500);
				}
				if(cityData.getTrainStationsNum()>0) {
					moneyLogic(cityData.getTrainStationsNum()*1500);
				}
				if(cityData.getCinemasNum()>0) {
					moneyLogic(cityData.getCinemasNum()*700);
				}
				if(cityData.getSupermarketsNum()>0) {
					moneyLogic(cityData.getSupermarketsNum()*900);
				}
				if(cityData.getFactoriesNum()>0) {
					moneyLogic(cityData.getFactoriesNum()*800);
				}
				if(cityData.getRestaurantsNum()>0) {
					moneyLogic(cityData.getRestaurantsNum()*200);
				}
				
			}
			
		}
	}
	public boolean moneyLogic(int saldo) {
		
		if(datiCitta.getSaldo()+saldo>=0) {
			datiCitta.setSaldo(datiCitta.getSaldo()+saldo);
			dati.setMoney(datiCitta.getSaldo()+"");
			return true;
		}
		return false;
	}
	public void setMessage(String s) {
		dati.setTextField(s);
	}
	public void addAbitanti(int number) {
		datiPanel.setNumeroAbitanti(datiPanel.getNumeroAbitanti()+number);
		setAbitanti();
	}
	public void setAbitanti() {
		
		dati.setPplNum(datiPanel.getNumeroAbitanti()+"");
	}

}
