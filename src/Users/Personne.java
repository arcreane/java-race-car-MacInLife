package Users;

import java.util.Scanner;

public class Personne {

	int Id;
	String Nom;
	String Prenom;
	Scanner scan = new Scanner(System.in);
	
    Personne() {
		
	}
	
	
    Personne(int id, String nom,  String prenom) {
    	Id = id;
		Nom = nom;
		Prenom = prenom;
		
	}

	public static Personne creationUtilisateur() {
		// TODO Auto-generated method stub
		 Personne utilisateur = new Personne();
			
	       
		 utilisateur.UtilisateurInfo();
			return utilisateur;
	}


	private void UtilisateurInfo() {
		// TODO Auto-generated method stub
		System.out.println("Entre ton nom et ton prénom pour commencer à jouer !");
		 Prenom = scan.next();
		 Nom = scan.next();
		 System.out.println("Votre nom est : " + Prenom + "  " + Nom );
		
	}
}
