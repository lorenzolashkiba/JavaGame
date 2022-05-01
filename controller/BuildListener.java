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
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==b.getHouse()) {
			
			System.out.print("s");
			int n = Integer.parseInt(frame.getNLblPutHouse());
			n++;
			frame.setNLblPutHouse(n+"");
			
		}else if(e.getSource()==b.getCinema()) {
			int n = Integer.parseInt(frame.getNLblPutCinema());
			n++;
			frame.setNLblPutCinema(n+"");
		}else if(e.getSource()==b.getRestaurant()) {
			int n = Integer.parseInt(frame.getNLblPutRestaurant());
			n++;
			frame.setNLblPutRestaurant(n+"");
		}else if(e.getSource()==b.getPoliceStation()) {
			int n = Integer.parseInt(frame.getNLblPutPoliceStation());
			n++;
			frame.setNLblPutPoliceStation(n+"");
		}else if(e.getSource()==b.getTrainStation()) {
			int n = Integer.parseInt(frame.getNLblPutTrainStation());
			n++;
			frame.setNLblPutTrainStation(n+"");
		}else if(e.getSource()==b.getAirport()) {
			int n = Integer.parseInt(frame.getNLblPutAirport());
			n++;
			frame.setNLblPutAirport(n+"");
		}else if(e.getSource()==b.getArcade()) {
			int n = Integer.parseInt(frame.getNLblPutArcade());
			n++;
			frame.setNLblPutArcade(n+"");
		}else if(e.getSource()==b.getCasino()) {
			int n = Integer.parseInt(frame.getNLblPutCasino());
			n++;
			frame.setNLblPutCasino(n+"");
		}else if(e.getSource()==b.getFactory()) {
			int n = Integer.parseInt(frame.getNLblPutFactory());
			n++;
			frame.setNLblPutFactory(n+"");
		}else if(e.getSource()==b.getSupermarket()) {
			int n = Integer.parseInt(frame.getNLblPutSupermarket());
			n++;
			frame.setNLblPutFactory(n+"");
		}
		
		
		
		
	}
	public BuildListener returnObj() {
		return this;
	}
	
}
