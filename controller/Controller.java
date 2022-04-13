package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import model.DatiPanel;
import view.Panel;

public class Controller extends Thread implements ActionListener{
	private Panel dati;
	private DatiPanel datiPanel;
	private long startTime;
	private DateTimeFormatter format;
	public Controller(Panel dati) {
		datiPanel = new DatiPanel(LocalDateTime.now());
		startTime = System.currentTimeMillis();
		this.dati = dati;
		this.start();
		format = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
		dati.getLblOra().setText(datiPanel.getDay().format(format));
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
			dati.getLblOra().setText(datiPanel.getDay().format(format));
			startTime = System.currentTimeMillis();
		}
	}
	public void run() {
		
		while(true) {
			
			dateChange();
			
		}
	}
	
}
