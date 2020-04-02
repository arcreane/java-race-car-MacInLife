package Moteur;

import Moteur.Moteur;
import Moteur.MoteurRapide;

public class MoteurRapide extends Moteur {

	public static Moteur moteurRapide() {
		
		MoteurRapide MoteurVoiture = new MoteurRapide();
		
       
		MoteurVoiture.initialisationMoteurRapide();
		return MoteurVoiture;
	


}
}
