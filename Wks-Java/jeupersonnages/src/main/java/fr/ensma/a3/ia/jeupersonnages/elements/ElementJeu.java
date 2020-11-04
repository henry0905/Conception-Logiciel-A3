package fr.ensma.a3.ia.jeupersonnages.elements;

import java.util.Objects;

import fr.ensma.a3.ia.jeupersonnages.elements.comportement.IDeplacable;

/**
 * Modèle d'un élément de base du jeu.
 * @author michaelrichard
 *
 */
public abstract class ElementJeu implements IDeplacable {

	private String id;

	/**
	 * Constructeur
	 * @param ident String, l'identifiant
	 * @throws NullPointerException si ident==null
	 */
	public ElementJeu(final String ident) 
		throws NullPointerException{
		Objects.requireNonNull(ident,"L'identifiant est null");
		id = ident;
	}

	/**
	 * Obtient l'identifiant de l'élément.
	 * @return String, l'identifiant
	 */
	final public String getId() {
		return id;
	}
		
	/**
	 * Obtient une représentation au format chaîne.
	 * @return String, la représentation
	 */
	@Override
	public String toString() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj == this) {
				return true;
			} else if (obj instanceof ElementJeu) {
				ElementJeu elem = (ElementJeu)obj;
				if (id.compareTo(elem.id)==0) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash = 9;
		hash = hash*MULT_HASH + (id != null ? id.hashCode() : 0);
		return hash;
	}
	
	private static final int MULT_HASH = 3;
		
}
