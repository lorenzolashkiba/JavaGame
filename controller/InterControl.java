package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import model.DataPanel;
import view.BuildFrame;
import view.Frame;
import view.Panel;
import view.WarningFrame;

public class InterControl extends Thread implements ActionListener{
	private Panel data;
	private DataPanel dataPanel;
	private long startTime;
	private DateTimeFormatter format;
	private Frame frame;
	private BuildListener buildListener;
	private BuildFrame buildFrame;
	
	public InterControl(Frame frame,BuildFrame bf) {
		dataPanel = new DataPanel(LocalDateTime.now());
		startTime = System.currentTimeMillis();
		this.frame = frame;
		this.data = frame.getPannello();
		this.start();
		format = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
		data.getLblHour().setText(dataPanel.getDay().format(format));
		buildFrame = bf;
		buildListener = new BuildListener(this,frame);
		data.btnPanelListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == data.getBtnBuild() ) {
			
			BuildFrame b = new BuildFrame();
			buildListener.setListener(b);
			b.setVisible(true);
			
		}else if(e.getSource() == data.getBtnWarnings()) {
			
			WarningFrame w = new WarningFrame();
			w.build();
		}
		
	}
	private void dateChange() {
		long elapsedTimeSec = (System.currentTimeMillis()-startTime)/1000;
		
		if(elapsedTimeSec>60) {
			System.out.print("new day");
			dataPanel.setDay(dataPanel.getDay().plusDays(1));
			
			// TODO write day to JLabel
			data.getLblHour().setText(dataPanel.getDay().format(format));
			startTime = System.currentTimeMillis();
		}
	}
	public void run() {
		
		while(true) {
			
			dateChange();
			
		}
	}

}
