package vrom;

public class Motociclo extends Veicolo{
	private int cilindrata;

	public Motociclo(String targa, String marca, String modello, boolean isGuasto, int cilindrata) {
		super(targa, marca, modello, isGuasto);
		this.cilindrata = cilindrata;
	}

	public int getCilindrata() {
		return cilindrata;
	}
}
