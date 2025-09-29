package personnages;

public class Romain {
	private String nom;
	private int force;
	public Romain(String nom, int force) {
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
		return "Le romain " + nom + " : ";
	}
	
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public void recevoirCoup(int force) {
		if (getForce() > 0) {
			System.out.println("Aie");
			setForce(getForce() - force);
		} else {
			System.out.println("J'abandonne");
		}
	}
}
