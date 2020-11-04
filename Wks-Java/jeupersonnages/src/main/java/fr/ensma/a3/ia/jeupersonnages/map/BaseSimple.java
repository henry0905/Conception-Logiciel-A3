package fr.ensma.a3.ia.jeupersonnages.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import fr.ensma.a3.ia.jeupersonnages.elements.personnages.PersonnageHumain;


/**
 * Classer Modelisant une Base Simple.
 * @author richardm
 * @version 1.0
 */
public class BaseSimple implements Cloneable{

	private String nom;
	private ECouleur couleur;
	private List<PersonnageHumain> lespersonnages;

	/**
	 * Retourne une instance de BaseSimple avec un nom et une couleur;
	 * @param n String, le nom de la base;
	 * @param coul {@link ECouleur}, la couleur de la base;
	 * @throws NullPointerException si n==null || coul==null
	 */
	public BaseSimple(final String n, final ECouleur coul)
		throws NullPointerException{
		Objects.requireNonNull(n,"Nom de la base null");
		Objects.requireNonNull(coul,"Couleur de la base null");
		nom = n;
		couleur = coul;
		lespersonnages = new ArrayList<PersonnageHumain>();
	}
	
	/**
	 * Obtient le nom de la base.
	 * @return String, le nom de la base
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Obtient la couleur de la base.
	 * @return {@link ECouleur}, la couleur de la base
	 */
	public ECouleur getCouleur() {
		return couleur;
	}

	public void ajoutePersonnage(PersonnageHumain pers) {
		lespersonnages.add(pers);
	}
	
	/**
	 * Rerprésentation au format String d'une Base Simple.
	 * @return String, la représentation textuelle.
	 */
	@Override
	public String toString() {
		return nom+"("+couleur+"-"+ lespersonnages.size()+")";
	}

	/**
	 * Obtient une copie de l'instance.
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	/**
	 * Test l'égalité de 2 bases.
	 * @param obj Object, la deuxième base à tester
	 * @return boolean, vrai si (nom et couleur identique), Faux sinon.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (this == obj) {
				return true;
			} else if (obj instanceof BaseSimple) {
				BaseSimple b = (BaseSimple) obj;
				if ((nom.compareTo(b.nom) == 0) && couleur.equals(b.couleur)) {
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Calcul le hashcode de l'instance.
	 */
	@Override
	public int hashCode() {
		int hash = 3;
		hash = hash*MULT_HASH + nom.hashCode();
		hash = hash*MULT_HASH + couleur.hashCode();
		return hash;
	}
	
	private static final int MULT_HASH = 7;
}
