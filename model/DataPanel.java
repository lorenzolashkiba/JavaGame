package model;

import java.time.LocalDateTime;

public class DataPanel {
	private LocalDateTime day; 
	
	public DataPanel(LocalDateTime day) {
		this.day = day;
		
	}

	public LocalDateTime getDay() {
		return day;
	}
	
	public void setDay(LocalDateTime day) {
		this.day = day;
	}
}
