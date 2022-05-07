package controller;
/**
 * Classe responsabile per il salvataggio del denaro
 * @author lorenzo lashkiba
 *
 */
public class DatiCitta {
	
	private int saldo;
	
	public DatiCitta(int saldo){
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
}
