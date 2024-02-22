package vrom;

public class Veicolo {
	private String targa;
	private String marca;
	private String modello;
	private boolean isGuasto;
	
	// Costruttore
	public Veicolo(String targa, String marca, String modello, boolean isGuasto) {
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.isGuasto = isGuasto;
	}
	
	// Metodi set get
	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public boolean isGuasto() {
		return isGuasto;
	}

	public void setGuasto(boolean isGuasto) {
		this.isGuasto = isGuasto;
	}

	

}
