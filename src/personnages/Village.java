package personnages;

public class Village {
	private String nom;
	private int nbVillageois=0;
	private Gaulois chef;
	private Gaulois[] villageois;

	public Village(String nom, Gaulois chef, int nB_VILLAGEOIS_MAX) {
		this.nom = nom;
		this.chef = chef;
		this.villageois = new Gaulois[nB_VILLAGEOIS_MAX];
		chef.setVillage(this);
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		if ( nbVillageois >= villageois.length) {
			System.out.println("Impossible d'ajouter "+gaulois.getNom() + ", village plein. "); 
			return;}
		villageois[nbVillageois]=gaulois;
		nbVillageois++;
		gaulois.setVillage(this);
		
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		int num = numVillageois -1; 
		if (num >= nbVillageois || num < 0 || villageois[num] == null) {
			System.out.println("Il n'y a pas autant d'habitants dans notre village !");
			return null;
		}
		return villageois[num];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village \" "+nom+ "\" du chef " +chef.getNom()+" vivent les légendaires gaulois  : ");
		for (Gaulois gaulois : villageois) {
			if(gaulois != null) {
				System.out.println("- "+gaulois.getNom());
			}
		}
	}
	
	public static void main (String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", abraracourcix, 30);
		
		Gaulois gaulois30 = village.trouverVillageois(30); 
		
		
		Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterVillageois(asterix);
		
		Gaulois gaulois = village.trouverVillageois(1); 
		System.out.println(gaulois); 
		gaulois = village.trouverVillageois(2); 
		System.out.println(gaulois); 
		
		
		Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterVillageois(obelix);
        village.afficherVillageois();
        
        Gaulois doublePolemix = new Gaulois("DoublePolémix", 4);
        
        abraracourcix.sePresenter();
        asterix.sePresenter();
        doublePolemix.sePresenter();
	}
	
	
}
