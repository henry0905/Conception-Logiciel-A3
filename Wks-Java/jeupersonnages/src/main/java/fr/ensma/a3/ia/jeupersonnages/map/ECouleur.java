package fr.ensma.a3.ia.jeupersonnages.map;

/**
 * Modélise les différentes couleur d'une base.
 * @author richardm
 * 
 */
public enum ECouleur {

	rouge(10), jaune(20), bleu(30), vert(40);
	
	private int valeurcouleur;
	
	private ECouleur(int val) {
		valeurcouleur = val;
	}

	/**
	 * Obtient la valeur associée à la couleur.
	 * @return int, la valeur.
	 */
	public int getValeurCouleur() {
		return valeurcouleur;
	}

	/**
	 * Obtient la représentation textuelle d'une couleur.
	 */
	@Override
	public String toString() {
		return super.toString() + "(" + valeurcouleur + ")";
	}
}
