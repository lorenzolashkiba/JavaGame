package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import model.CityData;
import view.BuildPanel;
import view.Frame;
import view.Panel;
import view.WarningPanel;

public class Controller extends Thread implements ActionListener
{
	private Panel data;
	private CityData cityData;
	private long startTime;
	private DateTimeFormatter format;
	private int change;	//0=Panel, 1=BuildPanel, 2=WarningPanel
	
	public Controller(Panel dati)
	{
		change=0;
		cityData = new CityData(LocalDateTime.now());
		startTime = System.currentTimeMillis();
		this.data = dati;
		this.start();
		format = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
		dati.getLblHour().setText(cityData.getDay().format(format));
		
		dati.btnPanelListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == data.getBtnBuild() ) {
			
//			BuildPanel b = new BuildPanel();
//			b.build();
//			b.setVisible(true);
//			setContentPane(b);
			change=1;
		}
		else if(e.getSource() == data.getBtnWarnings()) {
			
			WarningPanel w = new WarningPanel();
			w.build();
		}
		
	}
	
	private void dateChange()
	{
		long elapsedTimeSec = (System.currentTimeMillis()-startTime)/1000;
		
		if(elapsedTimeSec>60)
		{
//			System.out.print("new day");
			cityData.setDay(cityData.getDay().plusDays(1));
			
			// TODO write day to JLabel
			data.getLblHour().setText(cityData.getDay().format(format));
			startTime = System.currentTimeMillis();
		}
	}
	
	public void run() {
		
		while(true) {
			
			dateChange();
			
		}
	}
	
	public int getChange()
	{
		return change;
	}
}
