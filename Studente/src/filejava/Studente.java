package filejava;

public class Studente {
	private String nome;
	private String cognome;
	private String sesso;
	private String codiceFiscale;
	@Override
	public String toString() {
		return  nome + ";" + cognome + ";" + sesso + ";" + codiceFiscale;
	}
	
	public Studente(String nome,String cognome,String sesso,String codiceFiscale) {
		this.nome=nome;
		this.cognome=cognome;
		this.sesso=sesso;
		this.codiceFiscale=codiceFiscale;
	}
	
}