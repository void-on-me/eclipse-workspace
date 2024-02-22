package classi;

public class Main {

	public static void main(String[] args) {
	Uni universita = new Uni();
	
	// Creo oggetti di tipo Studente
	Studente studente1 = new Studente("Mario Rossi");
	Studente studente2 = new Studente("Luigi Alibrandi");
	Studente studente3 = new Studente("Alfonzo Gaetano");
	
	
	// Creo i corsi
    Corso corso1 = new Corso("Informatica");
    Corso corso2 = new Corso("Matematica");
    Corso corso3 = new Corso("Lettere");
    
    universita.iscriviStudente(studente1);
    universita.iscriviStudente(studente2);
    universita.iscriviStudente(studente3);
    
    universita.aggiungiCorso(corso1);
    universita.aggiungiCorso(corso2);
    universita.aggiungiCorso(corso3);
    
    String nomeDaCercare = "Alfonzo Gaetano";
    
    boolean isIscritto = universita.isStudenteIscritto(nomeDaCercare);
    if (isIscritto) {
    	System.out.println("Lo studente " + nomeDaCercare + " è iscritto all'università!");
    }
    else {
    	System.out.println("Lo studente " + nomeDaCercare + " non è iscritto all'università!");
    }
    
	}

}
