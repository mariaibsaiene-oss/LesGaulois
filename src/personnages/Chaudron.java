package personnages;

public class Chaudron {
	private int quantitePotion;

	public Chaudron(int quantitiePotion) {
		this.quantitePotion = quantitiePotion;
	}
	 public boolean restePotion() {
		 return quantitePotion > 0;
	}
	
	public void remplirChaudron(int quantite) {
		quantitePotion+= quantite;
	}
	
	public void utiliserPotion() {
		if ( quantitePotion > 0) {
			quantitePotion--; }
	}
	
	public int getQuantitePotion() {
		return quantitePotion;
	}
}
