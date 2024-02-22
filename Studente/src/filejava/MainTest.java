package filejava;

import java.util.*;

public class MainTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		StudenteDao.creaFile();
		
		try {
		
			System.out.println("Quanti studenti vuoi inserire ? :");
			int numStudenti=scInt.nextInt();
			int c=0;
			
			while(numStudenti>0 && c<numStudenti) {
				System.out.println("Inserisci il nome dello studente : ");
				String nome = sc.nextLine();
			
				System.out.println("Inserisci il cognome dello studente : ");
				String cognome = sc.nextLine();
			
				System.out.println("Inserisci il codice fiscale dello studente : ");
				String codiceFiscale = sc.nextLine();
			
				System.out.println("Inserisci il sesso dello studente : ");
				String sesso = sc.nextLine();
		
				Studente studente = new Studente(nome,cognome,sesso,codiceFiscale);
			
				StudenteDao.scriviStudente(studente);
				
				c++;
			}
			
		}catch(Exception e) {
			System.out.println("Errore di input." + e.getMessage());
		}finally {
			sc.close();
			scInt.close();
		}

	}

}