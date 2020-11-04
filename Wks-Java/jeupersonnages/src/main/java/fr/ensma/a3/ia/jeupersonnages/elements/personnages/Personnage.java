package fr.ensma.a3.ia.jeupersonnages.elements.personnages;

import java.util.Objects;

import fr.ensma.a3.ia.jeupersonnages.elements.ElementJeu;

/**
 * Modèle d'un personnage.
 * @author michaelrichard
 * @see ElementJeu
 *
 */
public abstract class Personnage extends ElementJeu {

	protected Float niveauVie;
	protected Float puissanceAttaque;
	

	/**
	 * Constructeur.
	 * @param ident String, l'identifiant
	 * @param nvie Float, le niveau de vie
	 * @throws NullPointerException si nvie==null || bse==null
	 */
	public Personnage(final String ident, final Float nvie) 
		throws NullPointerException {
		super(ident);
		Objects.requireNonNull(nvie,"Le niveau de vie est null");
		niveauVie = nvie;
	}
	
	/**
	 * Obtient le niveau de vie.
	 * @return Float, le niveau de vie.
	 */
	final public Float getNiveauVie() {
		return niveauVie;
	}
	
	/**
	 * Modifie le niveau de vie.
	 * @param nvie Float, le nouveau niveau de vie.
	 * @throws NullPointerException si nvie==null
	 */
	final public void setNiveauVie(final Float nvie)
		throws NullPointerException{
		Objects.requireNonNull(nvie,"Le niveau de vie est null");
		niveauVie = nvie;
	}
	
	/**
	 * Obtient une représentation au format chaîne.
	 */
	@Override
	public String toString() {
		return super.toString() + " - " + niveauVie;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj == this) {
				return true;
			} else if (obj instanceof Personnage) {
				Personnage pers = (Personnage)obj;
				if (super.equals(pers) && niveauVie.equals(pers.niveauVie) && 
						(puissanceAttaque != null ? puissanceAttaque.equals(pers.puissanceAttaque) : true)) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash = 5;
		hash = hash*MULT_HASH + super.hashCode();
		hash = hash*MULT_HASH + (niveauVie != null ? niveauVie.intValue() : 0);
		hash = hash*MULT_HASH + (puissanceAttaque != null ? puissanceAttaque.intValue() : 0);
		return hash;
	}
	
	private static final int MULT_HASH = 7;
	
}
