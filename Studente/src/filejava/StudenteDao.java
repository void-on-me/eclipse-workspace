package filejava;

import java.io.*;

public class StudenteDao {
	
	
	public static void creaFile() {
		try {
	      File myObj = new File("/home/michele/Desktop/studenti.csv");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}
	
	public static void scriviStudente(Studente studente) {
		try {
		      FileWriter myWriter = new FileWriter("/home/michele/Desktop/studenti.csv",true);
		      myWriter.write(studente.toString() + "\n");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	
	/* public static void cercaStudente() {
		try {
			
		} catch(IOException e) {
			System.out.println("error:" + e.getMessage());
		}
	} */ 

	
}