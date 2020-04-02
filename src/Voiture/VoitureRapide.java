package Voiture;

import java.util.ArrayList;
import java.util.Scanner;

import Voiture.Voiture;
import Voiture.VoitureRapide;
import Moteur.Moteur;
import Roues.Roues;



public class VoitureRapide extends Voiture {
	Scanner scan = new Scanner(System.in);
	VoitureRapide(){
	}
	VoitureRapide(int id, String nom, String couleur, int rapide, String puissance, Moteur moteur, Roues[] arrayRoues,  String volant, String frein) {
		super(id, nom, couleur, rapide, puissance,  moteur, arrayRoues, volant, frein);
	
	}

	public static Voiture creationVoitureRapide() {
        VoitureRapide voitureRapide = new VoitureRapide();
		
       
        voitureRapide.RemplirVoitureInfo();
		return voitureRapide;
	}

	
	public void RemplirVoitureInfo() {
		// TODO Auto-generated method stub
		
	}
	public static VoitureRapide PuissanceAccelere() {
		VoitureRapide PuissanceAccelere = new VoitureRapide();
		
     
		PuissanceAccelere.AccelereVoitureRapide();
		return PuissanceAccelere;
		
	
	}
}
