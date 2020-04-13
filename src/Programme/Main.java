package Programme;

import java.util.ArrayList;
import java.util.Scanner;

import Moteur.Moteur;
import Moteur.MoteurLent;
import Moteur.MoteurRapide;
import Users.Personne;
import Voiture.Voiture;
import Voiture.VoitureLente;
import Voiture.VoitureRapide;

public class Main {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Personne> utilisateur = new ArrayList<>();
		ArrayList<Voiture> voiture = new ArrayList<>();
		ArrayList<Moteur> moteur = new ArrayList<>();
		
		
		 utilisateur.add(Personne.creationUtilisateur());
		
		System.out.println("Type de voiture :  \n- 1 = Voiture Rapide, \n- 2 = Voiture Lente !");
		while( scan.hasNextInt() == false ) {
			System.out.println("Tape 1 ou 2 pour faire ton choix");
			scan.next();
		}	
		 int reponse = scan.nextInt();
		 switch(reponse) {
		  case 1:
			  System.out.println("Votre choix : Voiture Rapide");
			 
			
			 voiture.add(VoitureRapide.creationVoitureRapide());
			 moteur.add(MoteurRapide.moteurRapide());
			 System.out.println("Votre voiture démarre..., A quel vitesse voulez vous roulez ?");
			 System.out.println("Attention, selon la vitesse choisi, vous risquez de perdre des pieces...");
			 voiture.add(VoitureRapide.PuissanceAccelere());
			 
		    break;
		  case 2:
			  System.out.println("Votre choix : Voiture Lente");
			  voiture.add(VoitureLente.creationVoitureLente());
			  moteur.add(MoteurLent.moteurLent());
			  System.out.println("Votre voiture démarre..., A quel vitesse voulez vous roulez ?");
			  System.out.println("Selon la vitesse choisi, vous aurez le droit à un boost de vitesse.");
			  voiture.add(VoitureLente.PuissanceAccelere());
			 
			  
			 
			  
		    break;
		
		  default:
			   
			 
			}
		
	}
	

}
