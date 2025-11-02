package personnages;
import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified() ;
	}
	
	private boolean isInvariantVerified() {
		return this.force>= 0;
	}
	
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	private String prendreParole() {
		return "Le Romain " + nom + " : ";
	}
	
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0 ;
		
		int forceAvant = this.force;
		
		this.force -= forceCoup;
		if (this.force < 1) {
			parler("J'abandonne !");
		} else {
            parler("Aïe");
		}
		
		assert this.force <= forceAvant; //postcondition 
		assert isInvariantVerified();
	}
	
	public void sEquiper(Equipement equipement) {
        switch (nbEquipement) {
        case 2:
        	System.out.println("Le soldat " + nom + " est déjà bien protégé !");
            break;
        case 1:
        	if (equipements[0] == equipement) {
                System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
            } else {
                addEquipement(equipement);
            }
            break;
        case 0 : 
        	addEquipement(equipement);
            break;
        }
	}
	
	private void addEquipement(Equipement e) {
        equipements[nbEquipement++] = e;
        System.out.println("Le soldat " + nom + " s'équipe avec un " + e + ".");
    }
	
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		
		Romain r = new Romain("Minus", 6);
        r.sEquiper(Equipement.CASQUE);
        r.sEquiper(Equipement.CASQUE);
        r.sEquiper(Equipement.BOUCLIER);
        r.sEquiper(Equipement.CASQUE);
	}
}
