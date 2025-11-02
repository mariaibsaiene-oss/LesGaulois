package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	private Village village;
	
	public Gaulois(String nom, int force) {
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
		return "Le gaulois " + nom + " : ";
	}
	public void frapper(Romain romain) {
		String nomRomain= romain.getNom();
		System.out.println(nom+" envoie un grand coup dans la machoire de " +nomRomain);
		int forceCoup = (force * effetPotion) /3;
		romain.recevoirCoup(forceCoup);
		if ( effetPotion > 1) {
			effetPotion--;
		}
	}
	
	public int getEffetPotion() {
		return effetPotion;
	}
	public void setEffetPotion(int effetPotion) {
		if(effetPotion < 1) {
			this.effetPotion = 1;
		}else {
		this.effetPotion = effetPotion;}
	}
	public void boirePotion(int forcePotion) {
		
	}
	
	@Override
	public String toString() {
		return getNom() ;
	}
	
	public Village getVillage() {
		return village;
	}
	public void setVillage(Village village) {
		this.village = village;
	}
	
	public void sePresenter() {
		System.out.println("Le Gaulois " +nom+ ": \" Bonjour, je m'appelle " +nom+ ".");
		if ( village == null) {
			System.out.println("Je voyage de villages en villages.\"");
		} else if ( village.getChef()==this) {
            System.out.println("Je suis le chef du village " + village.getNom() + ".\"");
		} else {
            System.out.println("J'habite le village " + village.getNom() + ".\"");
		}
		
	}
	
	
	public static void main(String args[]) {
		   Gaulois asterix = new Gaulois("Astérix",8);
		   System.out.println(asterix);
	 }
}
