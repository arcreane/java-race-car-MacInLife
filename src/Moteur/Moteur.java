package Moteur;

import java.util.Scanner;

public class Moteur {
	String Marque;

	Scanner scan = new Scanner(System.in);
	
	 Moteur(){
			
		}
	 Moteur(String marque){
		  Marque = marque;
		
		 
	  }
	  public void initialisationMoteurRapide() {
		
			 System.out.println("Votre moteur de voiture est :");
			 Marque = "Thermique";
			
			System.out.println( Marque );
	}
	  public void initialisationMoteurLent() {
			
			 System.out.println("Votre moteur de voiture est :");
			 Marque = "Electrique";
			
			
			System.out.println( Marque );
			
			
			
		}
}
