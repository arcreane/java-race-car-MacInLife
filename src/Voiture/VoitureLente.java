package Voiture;
import java.util.Scanner;

import Moteur.Moteur;
import Roues.Roues;

public class VoitureLente extends Voiture {
	Scanner scan = new Scanner(System.in);
	VoitureLente(){
		
	}
	VoitureLente(int id, String nom, String couleur, int rapide, String puissance, Moteur moteur, Roues[] arrayRoues,  String volant, String frein) {
		super(id, nom, couleur, rapide, puissance,  moteur, arrayRoues, volant, frein);
	
	}

	public static Voiture creationVoitureLente() {
		VoitureLente voitureLente = new VoitureLente();
		
       
		voitureLente.RemplirVoitureInfo();
		return voitureLente;
	}

	
	public static Voiture PuissanceAccelere() {
		VoitureLente PuissanceAccelere = new VoitureLente();
		
     
		PuissanceAccelere.AccelereVoitureLente();
		return PuissanceAccelere;
		
	
	}
}
