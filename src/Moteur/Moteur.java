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
		
			 System.out.println("Moteur :");
			 Marque = "Thermique";
			
			System.out.println( Marque );
	}
	  public void initialisationMoteurLent() {
			
			 System.out.println("Moteur :");
			 Marque = "Electrique";
			
			
			System.out.println( Marque );
			
			
			
		}
}
