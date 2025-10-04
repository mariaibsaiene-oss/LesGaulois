package personnages;

public class Druide {
	private String nom;
	private int force;
	private int nbDose;
	private int effetPotion;
	
	public Druide(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public void fabriquerPotion( int nbDose, int effetPotion) {
		this.nbDose = nbDose;
		this.effetPotion =  effetPotion;
		parler("J'ai concocté " + nbDose+ " doses de potion magique. Elle a une force de " + effetPotion+".");
		
	}
	
	public void boosterGaulois( Gaulois gaulois) {
		if( gaulois.getNom().equals("Obélix")) {
			parler("Non, Obélix Non ! ... Et tu le sais très bien !");
			
		}else if(nbDose > 0) {
			parler("Tiens " +gaulois.getNom()+ " un peu de potion magique. ");
			gaulois.setEffetPotion(effetPotion);
			nbDose--;
		}else {
			parler("Désolé " + gaulois.getNom()+ ", il n'y a plus de potion !");
		}
	}
	
}
