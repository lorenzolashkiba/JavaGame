package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.CityData;
import view.Frame;
import view.BuildFrame;

public class BuildListener implements ActionListener {
	
	private BuildFrame b;
	private Frame frame;
	private InterControl c;
	private CityData cityData;
	
	public BuildListener(InterControl interControl,Frame frame,CityData cityData) {
		this.c = interControl;
		this.frame = frame;
		this.cityData = cityData;
		

	}
	public void setListener(BuildFrame b) {
		this.b = b;
		this.b.setBuildListener(this);
		this.b.btnBuildListener(this);
	}
	private boolean compra(int saldo,int n,String key) {
		if(c.moneyLogic(saldo)) {
			c.setMessage("");
			n++;
			frame.setNLblPut(key,n+"");
			return true;
		}else {
			c.setMessage("non hai abbastanza fondi");
			return false;
		}
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==b.getCondominio()) {
		
			int n = Integer.parseInt(frame.getNLblPutHouse());
			if(compra(-3000,n,frame.keyHouse)) {
				c.addAbitanti(30);
				cityData.setHousesNum(cityData.getHousesNum()+1);
			}
			
		}else if(e.getSource()==b.getCinema()) {
			int n = Integer.parseInt(frame.getNLblPutCinema());
			if(compra(-3000,n,frame.keyCinema)) {
				c.addAbitanti(3);
				cityData.setCinemasNum(cityData.getCinemasNum()+1);
			}
			
		}else if(e.getSource()==b.getRistorante()) {
			int n = Integer.parseInt(frame.getNLblPutRestaurant());
			if(compra(-1500,n,frame.keyRestaurant)) {
				c.addAbitanti(3);
				cityData.setRestaurantsNum(cityData.getRestaurantsNum()+1);
			}
			
		}else if(e.getSource()==b.getStazionePolizia()) {
			int n = Integer.parseInt(frame.getNLblPutPoliceStation());
			if(compra(-2000,n,frame.keyPoliceStation)) {
				c.addAbitanti(4);
				cityData.setPoliceStationsNum(cityData.getPoliceStationsNum()+1);
			}
			
		}else if(e.getSource()==b.getStazioneTreni()) {
			int n = Integer.parseInt(frame.getNLblPutTrainStation());
			if(compra(-7000,n,frame.keyTrainStation)) {
				c.addAbitanti(6);
				cityData.setTrainStationsNum(cityData.getTrainStationsNum()+1);
			}
			
		}else if(e.getSource()==b.getAereoporto()) {
			int n = Integer.parseInt(frame.getNLblPutAirport());
			if(compra(-10000,n,frame.keyAirport)) {
				c.addAbitanti(10);
				cityData.setAirportsNum(cityData.getAirportsNum()+1);
			}
			
		}else if(e.getSource()==b.getSalaGiochi()) {
			int n = Integer.parseInt(frame.getNLblPutArcade());
			if(compra(-2500,n,frame.keyArcade)) {
				c.addAbitanti(2);
				cityData.setArcadesNum(cityData.getArcadesNum()+1);
			}
			
		}else if(e.getSource()==b.getCasino()) {
			int n = Integer.parseInt(frame.getNLblPutCasino());
			if(compra(-2000,n,frame.keyCasino)) {
				c.addAbitanti(2);
				cityData.setCasinoNum(cityData.getCasinoNum()+1);
			}
			
		}else if(e.getSource()==b.getFabbrica()) {
			int n = Integer.parseInt(frame.getNLblPutFactory());
			if(compra(-5000,n,frame.keyCasino)) {
				c.addAbitanti(15);
				cityData.setFactoriesNum(cityData.getFactoriesNum()+1);
			}
			
		}else if(e.getSource()==b.getSupermarket()) {
			int n = Integer.parseInt(frame.getNLblPutSupermarket());
			if(compra(-3500,n,frame.keySupermarket)) {
				c.addAbitanti(8);
				cityData.setSupermarketsNum(cityData.getSupermarketsNum()+1);
			}
		}
		
	
		
		
	}
	public BuildListener returnObj() {
		return this;
	}
	
}
