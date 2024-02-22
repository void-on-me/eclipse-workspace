package dipendenti;

public class Dipendente extends Persona {
	protected double stipendio;
	protected int annoAssunzione;	

	
	
	public Dipendente(double stipendio, int annoAssunzione, String nome, String cognome, String CF, int eta) {
		super(nome, cognome, CF, eta);
		this.stipendio = stipendio;
		this.annoAssunzione = annoAssunzione;
	}



	// Setters and Getters
	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
	
	// Visualizza
	public void visualizza() {
		System.out.println("nome: " + nome);
		System.out.println("cognome: " + cognome);
		System.out.println("codice fiscale : " + CF);
		System.out.println("anno assunzione : " + annoAssunzione);
		System.out.println("stipendio " + stipendio);
	}
	
	// Metodo guadagna
		public boolean guadagnaPiuDi(Dipendente dipendente) {
		if(this.stipendio > dipendente.getStipendio()) {
			return true;
		}
		else{
			return false;
		}
	}
}
