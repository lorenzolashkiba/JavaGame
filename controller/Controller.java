package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import model.DatiPanel;

public class Controller extends Thread implements ActionListener{
	//Finestra f;
	private DatiPanel datiPanel;
	private long startTime;
	private long minTime;
	  
	public Controller() {
		datiPanel = new DatiPanel(LocalDateTime.now());
		startTime = System.currentTimeMillis();
   
		this.start();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	private void dateChange() {
		long elapsedTimeSec = (System.currentTimeMillis()-startTime)/1000;
		
		if(elapsedTimeSec>60) {
			System.out.print("new day");
			datiPanel.setDay(datiPanel.getDay().plusDays(1));
			
			// TODO write day to JLabel
			startTime = System.currentTimeMillis();
		}
	}
	public void run() {
		
		while(true) {
			
			dateChange();
			
		}
	}
	
}
