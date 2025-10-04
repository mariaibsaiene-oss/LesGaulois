package test_fonctionnel;

import personnages.*;

public class TestGaulois {
   public static void main(String args[]) {
	   
	   Gaulois asterix = new Gaulois("Astérix",8);
	   Gaulois obelix = new Gaulois("Obélix",16);
	   
	   asterix.parler("Bonjour Obélix.");
	   obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
	   asterix.parler("Oui tres bonne idée.");
	   
	   Romain minus = new Romain("minus",6);
	   System.out.println("Dans la foret " +asterix.getNom() +" et "+obelix.getNom() +" tombent nez à nez sur le romain "+ minus.getNom());
	   for (int i=0; i<3; i++) {
		   asterix.frapper(minus);
	   }
	   
	   // potion de magique 
	   Romain brutus = new Romain("Brutus",14);
	   Druide panoramix = new Druide( "Panoramix",2);
	   
	   panoramix.fabriquerPotion(4, 3);
	   panoramix.boosterGaulois(obelix);
	   panoramix.boosterGaulois(asterix);
	   
	   for(int i=0; i<3;i++) {
		   asterix.frapper(brutus);
	   }
   }
}
