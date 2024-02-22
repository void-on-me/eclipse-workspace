package classi;

public class Uni {
	
	// Attributi della classe
	private Studente[] studenti;
	private Corso[] corsi;
	
	private int numStudenti;
	private int numCorsi;
	private final int MAX_STUDENTI = 10; // Super limited 
	private final int MAX_CORSI = 3; // Informatica, Lettere, Matematica
	
	// Costruttore
	public Uni() {
		studenti = new Studente[MAX_STUDENTI];
		corsi = new Corso[MAX_CORSI];
		numStudenti = 0;
		numCorsi = 0;
	}
	
	// Comportamento della classe
	
	public void iscriviStudente(Studente studente) {
			studenti[numStudenti++] = studente;
    }
	
	public void aggiungiCorso(Corso corso) {
        if (numCorsi < MAX_CORSI) {
            corsi[numCorsi++] = corso;
        } else {
            System.out.println("Limite massimo di corsi raggiunto.");
        }
    }
	
	public boolean isStudenteIscritto(String nomeStudente) {
        for (int i = 0; i < numStudenti; i++) {
            if (studenti[i].getNome().equals(nomeStudente)) {
                return true;
            }
        }
        return false;
    }
}
