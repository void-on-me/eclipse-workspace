package sale;

public class Saliera extends Barattolo {
	private int numBuchini;

	public Saliera(double volume, int numBuchini) {
		super(volume);
		this.numBuchini = numBuchini;
	}
	
	public void dosaSale() {
		if (getContenuto() >= 0) {
			double qUnitaria = getContenuto() / numBuchini;
			System.out.println("Qunatità unitaria: " + qUnitaria);
		} else {
			System.out.println("Impossibile dosare il sale: Saliera vuota");
		}
	}
	
}
