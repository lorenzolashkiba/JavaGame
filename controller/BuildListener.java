package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;

import view.Frame;
import view.BuildFrame;

public class BuildListener implements ActionListener {
	
	private BuildFrame b;
	private Frame frame;
	private InterControl c;
	public BuildListener(InterControl interControl,Frame frame) {
		this.c = interControl;
		this.frame = frame;
	
		

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
			
			System.out.print("s");
			int n = Integer.parseInt(frame.getNLblPutHouse());
			if(compra(-3000,n,frame.keyHouse)) {
				c.addAbitanti(30);
			}
			
		}else if(e.getSource()==b.getCinema()) {
			int n = Integer.parseInt(frame.getNLblPutCinema());
			compra(-3000,n,frame.keyCinema);
			
		}else if(e.getSource()==b.getRistorante()) {
			int n = Integer.parseInt(frame.getNLblPutRestaurant());
			compra(-1500,n,frame.keyRestaurant);
		}else if(e.getSource()==b.getStazionePolizia()) {
			int n = Integer.parseInt(frame.getNLblPutPoliceStation());
			compra(-2000,n,frame.keyPoliceStation);
		}else if(e.getSource()==b.getStazioneTreni()) {
			int n = Integer.parseInt(frame.getNLblPutTrainStation());
			compra(-7000,n,frame.keyTrainStation);
		}else if(e.getSource()==b.getAereoporto()) {
			int n = Integer.parseInt(frame.getNLblPutAirport());
			compra(-10000,n,frame.keyAirport);
		}else if(e.getSource()==b.getSalaGiochi()) {
			int n = Integer.parseInt(frame.getNLblPutArcade());
			compra(-2500,n,frame.keyArcade);
		}else if(e.getSource()==b.getCasino()) {
			int n = Integer.parseInt(frame.getNLblPutCasino());
			compra(-2000,n,frame.keyCasino);
		}else if(e.getSource()==b.getFabbrica()) {
			int n = Integer.parseInt(frame.getNLblPutFactory());
			compra(-5000,n,frame.keyCasino);
		}else if(e.getSource()==b.getSupermarket()) {
			int n = Integer.parseInt(frame.getNLblPutSupermarket());
			compra(-3500,n,frame.keySupermarket);
		}
		
	
		
		
	}
	public BuildListener returnObj() {
		return this;
	}
	
}
