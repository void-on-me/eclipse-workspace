package sale;

public class Barattolo {
	private double volume;
	private double contenuto;
	

	public Barattolo(double volume) {
		// super();
		this.volume = volume;
		this.contenuto = 0.0;
	}
	
	public double getVolume() {
		return volume;
	}
	public double getContenuto() {
		return contenuto;
	}

	
	public void aggiungiContenuto(double daAggiungere) {
		if(daAggiungere + contenuto <= volume) {
			contenuto += daAggiungere;
		} else {
			System.out.println("Contenuto del barattolo pieno!");
		}
	}
	
	public void rimuoviContenuto(double daRimuovere) {
		if(contenuto - daRimuovere <= 0) {
			contenuto += daRimuovere;
		} else {
			System.out.println("Impossibile rimuovere più di quanto già c'è nel barattolo!");
		}
	}
	
}
