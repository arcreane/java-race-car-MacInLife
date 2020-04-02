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
		
		System.out.println("Type de voiture : 1 = Voiture Rapide, 2 = Voiture Lente !");
		while( scan.hasNextInt() == false ) {
			System.out.println("Choisie un nombre entre 1 et 2");
			scan.next();
		}	
		 int reponse = scan.nextInt();
		 switch(reponse) {
		  case 1:
			  System.out.println("Votre choix : Voiture Rapide");
			 
			
			 voiture.add(VoitureRapide.creationVoitureRapide());
			 moteur.add(MoteurRapide.moteurRapide());
			 System.out.println("Vous voiture commence a roulez avec une certain vitesse, choisisez la vitesse de votre voiture ?");
			 System.out.println("Attention, selon la vitese choisie vous risque de perdre des pieces...");
			 voiture.add(VoitureRapide.PuissanceAccelere());
			 
		    break;
		  case 2:
			  System.out.println("Vous avez choisie une voiture lente");
			  voiture.add(VoitureLente.creationVoitureLente());
			  moteur.add(MoteurLent.moteurLent());
			  System.out.println("Vous voiture commence a roulez avec une certain vitesse, choisisez la vitesse de votre voiture ?");
			  System.out.println("Attention, selon la vitese choisie vous avez le droit un boost de vitesse.");
			  voiture.add(VoitureLente.PuissanceAccelere());
			 
			  
			 
			  
		    break;
		
		  default:
			   
			 
			}
		
	}
	

}
