package model;

import java.time.LocalDateTime;

<<<<<<< HEAD:model/DatiPanel.java
public class DatiPanel {
	private int numeroAbitanti; 
	public DatiPanel() {
		numeroAbitanti=0;
=======
public class DataPanel {
	private LocalDateTime day; 
	
	public DataPanel(LocalDateTime day) {
		this.day = day;
		
>>>>>>> ac31ccb806f7d28fb2235efd81e68483c038a081:model/DataPanel.java
	}
	public int getNumeroAbitanti() {
		return numeroAbitanti;
	}
	public void setNumeroAbitanti(int numeroAbitanti) {
		this.numeroAbitanti = numeroAbitanti;
	}

	
}
