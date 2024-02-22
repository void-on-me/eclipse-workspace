package dipendenti;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		try {
			Dipendente Dipendente1 = new Dipendente(20.000, 2000, "Luigi", "Ambrosio", "CFHAUFEUAS", 20);
			Dipendente Dipendente2 = new Dipendente(23.000, 2017, "Gaetano", "Tassi", "DASH/£WDSA", 35);
			Dipendente Dipendente3 = new Dipendente(30.000, 1995, "Patassi", "PUSSO", "HCAS(ADdsa", 60);
			
			Dipendente[] arrDipendenti = {Dipendente1, Dipendente2, Dipendente3};
			
			
		}catch(Exception e){
			System.out.println("Errore: " + e.getMessage());
		}
		finally{
			in.close();
		}
		
	}

}
