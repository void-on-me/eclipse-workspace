package vrom;

public class Vettura extends Veicolo{
	private String tipologia;

	public Vettura(String targa, String marca, String modello, boolean isGuasto, String tipologia) {
		super(targa, marca, modello, isGuasto);
		this.tipologia = tipologia;
	}

	public String getTipologia() {
		return tipologia;
	}

}