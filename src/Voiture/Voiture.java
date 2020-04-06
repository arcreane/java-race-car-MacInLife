package Voiture;
import org.fusesource.jansi.Ansi;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

import java.util.Random;
import java.util.Scanner;

import Moteur.Moteur;
import Roues.Roues;

public class Voiture {
	int Id;
	String Nom;
	Moteur Moteur;
	Scanner scan = new Scanner(System.in);
	Roues[] ArrayRoues = new Roues[4];
	String Volant;
	String Frein;
	String Retro;
	String Couleur;
	int Rapide;
	String Puissance;
	 String OrdreMot;
	 Voiture() {
			
		}
	
	
	Voiture(int id, String nom, String couleur, int rapide, String puissance,  Moteur moteur, Roues[] arrayRoues,  String volant, String frein) {
		Nom = nom;
		Id = id;
		Moteur Moteur = moteur;
		Roues[] ArrayRoues = arrayRoues;
		Volant = volant;
		Frein = frein;
		Couleur = couleur;
		Rapide = rapide;
		Puissance = puissance;
		
	}
	
	public void RemplirVoitureInfo(){
		 System.out.println("Veuillez écrire le modèle de votre voiture.");
		 Nom = scan.next();
		 System.out.println("La marque de votre véhicule est : " + Nom);
		 System.out.println("Choisir la couleur de votre voiture :"
		 		+ "\n- Bleu = 1,"
		 		+ "\n- Jaune = 2,"
		 		+ "\n- Rouge = 3");
		 
		 while( scan.hasNextInt() == false ) {
			 System.out.println("Taper un des chiffres précédent pour choisir votre couleur");
			 scan.next();
			}
		 int reponse = scan.nextInt();
		 switch(reponse) {
		  case 1:
			  Couleur = "BLEU";
			  System.out.println( ansi().eraseScreen().fg(Ansi.Color.BLUE).a("Votre voiture est : " + Couleur).reset() );
			 
		    break;
		  case 2:
			  Couleur = "JAUNE";
			  System.out.println( ansi().eraseScreen().fg(YELLOW).a("Votre voiture est : " + Couleur).reset() );
			  break;
			  
		  case 3:
			  Couleur = "ROUGE";
			  System.out.println( ansi().eraseScreen().fg(RED).a("Votre voiture est : " + Couleur).reset() );
			  break;
		  default:
			   
				 
			
		 }
		
		

	}
	
protected void AccelereVoitureRapide() {
		
		int Acceleration = scan.nextInt();
		Puissance = "faible";
		
		
		System.out.println("Votre voiture de couleur  à une vitesse de "  + Acceleration + " et une puissance " + Puissance );
		
		 System.out.println();
         if(Acceleration > 30) {
        	 Frein = "Frein";
        	 Volant = "Volant";
			Retro = "Rétro";
			
			 String[] tab = {Frein, Volant, Retro};
			 Random r = new Random();
			 String piecePerdu = tab[r.nextInt(tab.length)];
			
			
			 
			 System.out.println("Votre voiture avance un peu trop vite, vous risquez de perdre des pieces en routes !");
			
			
			
			 char reponse = 'O';
			 Scanner sc = new Scanner(System.in);
			 while (reponse == 'O') {
				 System.out.println("Vous venez de perdre une piece : " + piecePerdu );
				 System.out.println("Merci de taper le nom de la piece a réparer");
				 String piece = scan.next();
				 if(piece.equals(piecePerdu)) {
					 System.out.println(ansi().eraseScreen().fg(GREEN).a("La pièces est desormais réparer"));
					 System.out.println(ansi().eraseScreen().fg(GREEN).a("La voiture a fini son parcours après 50 km !"));
				 }
				 else {
					
					 System.out.println("Pièces toujours manquante...");
					
				 }
				 reponse = ' ';
				 while(reponse != 'O' && reponse != 'N' && !piece.equals(piecePerdu))
				  {
				   
				    System.out.println(ansi().eraseScreen().fg(RED).a("Voulez-vous réessayer ? (O/N)"));
				    reponse = sc.nextLine().charAt(0);
				   
				  }
				 
			 }
		
			
			 
		 }
		 else {
			 System.out.println(ansi().eraseScreen().fg(GREEN).a("Votre voiture avance normalement."));
			 System.out.println(ansi().eraseScreen().fg(GREEN).a("La voiture a terminé son parcours apres 50 km..."));
			
		 }
	}
	public void AccelereVoitureLente() {
		int Acceleration = scan.nextInt();
		Puissance = "faible";
		
	
			 System.out.println("Votre voiture à une vitesse de "  + Acceleration + "  et une puissance " + Puissance);
	
         if(Acceleration > 30) {
        	 
        	
    			 System.out.println("Votre voiture avance normalement, pas de boost de vitesse");
    			 System.out.println("La voiture a terminé son parcours apres 50 km ...");
    		
  
			 
		 }
		 else {
			
    		 System.out.println("Votre voiture avance doucement, vous avez le droit a un boost de vitesse...");
    		 System.out.println("Pour que le boost s'active, entrer le mot qui va apparaître.");
    		
   	
			 Random rand = new Random();
			 String alphabet = "VITESSE";
			 int longueur = alphabet.length();
			 
			 for(int i = 0; i < 7; i++) {
				 int k = rand.nextInt(longueur);
			  
				 OrdreMot = alphabet.charAt(k)+"";
			
			   System.out.print(OrdreMot);
			   
				
			  
			 }
			
			 String boost = scan.next();
			
			 if(boost == OrdreMot) {
				 
				 System.out.println(ansi().eraseScreen().fg(GREEN).a("Boost activé avec succes"));
				 System.out.println(ansi().eraseScreen().fg(GREEN).a("La voiture a terminé son parcours apres 50 km..."));
				 
			 }
			 else {
				 System.out.println(ansi().eraseScreen().fg(RED).a("Echec d'activation du Boost"));
				 System.out.println(ansi().eraseScreen().fg(RED).a("La voiture n'a pas terminé son parcours"));
				  
			 }
			
			 
			
		 }
	}
}
	

