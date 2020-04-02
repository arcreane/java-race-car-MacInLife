package Moteur;

import Moteur.Moteur;
import Moteur.MoteurLent;

public class MoteurLent extends Moteur {

	public static Moteur moteurLent() {
		
		MoteurLent MoteurVoiture = new MoteurLent();
		
       
		MoteurVoiture.initialisationMoteurLent();
		return MoteurVoiture;
	


}
}
