package model;

import java.time.LocalDateTime;

public class DatiPanel {
	private LocalDateTime day; 
	
	public DatiPanel(LocalDateTime day) {
		this.day = day;
		
	}

	public LocalDateTime getDay() {
		return day;
	}
	
	public void setDay(LocalDateTime day) {
		this.day = day;
	}
}
