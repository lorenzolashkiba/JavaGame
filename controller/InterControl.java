package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import model.DatiPanel;
import view.BuildFrame;
import view.Frame;
import view.Panel;
import view.WarningFrame;

public class InterControl extends Thread implements ActionListener{
	private Panel dati;
	private DatiPanel datiPanel;
	private long startTime;
	private DateTimeFormatter format;
	private Frame frame;
	private BuildListener buildListener;
	private BuildFrame buildFrame;
	
	public InterControl(Frame frame,BuildFrame bf) {
		datiPanel = new DatiPanel(LocalDateTime.now());
		startTime = System.currentTimeMillis();
		this.frame = frame;
		this.dati = frame.getPannello();
		this.start();
		format = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
		dati.getLblHour().setText(datiPanel.getDay().format(format));
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
	private void dateChange() {
		long elapsedTimeSec = (System.currentTimeMillis()-startTime)/1000;
		
		if(elapsedTimeSec>60) {
			System.out.print("new day");
			datiPanel.setDay(datiPanel.getDay().plusDays(1));
			
			// TODO write day to JLabel
			dati.getLblHour().setText(datiPanel.getDay().format(format));
			startTime = System.currentTimeMillis();
		}
	}
	public void run() {
		
		while(true) {
			
			dateChange();
			
		}
	}

}
