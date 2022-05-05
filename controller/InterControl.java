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
		buildListener = new BuildListener(this,frame);
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
		
		if(elapsedTimeSec>60) {
			System.out.print("new day");
			cityData.setDay(cityData.getDay().plusDays(1));
			
			// TODO write day to JLabel
			dati.getLblHour().setText(cityData.getDay().format(format));
			startTime = System.currentTimeMillis();
			return true;
		}
		return false;
	}
	public void run() {
		
		while(true) {
			
			if(dateChange()) {
				
			}
			
		}
	}
	public boolean moneyLogic(int saldo) {
		System.out.print(datiCitta.getSaldo()+saldo);
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
