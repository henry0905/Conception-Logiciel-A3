package fr.ensma.a3.ia.jeupersonnages.elements.personnages;

import java.util.Objects;

import fr.ensma.a3.ia.jeupersonnages.map.BaseSimple;

/**
 * Modèle d'un ouvrier.
 * @author michaelrichard
 * @see PersonnageHumain
 */
public class Ouvrier extends PersonnageHumain implements Cloneable{

	private Float puissancetravail;
	private static int numinstance = 1;

	/**
	 * Constructeur : Obtient une instance d'ouvrier avec identifiant par défaut.
	 * @param nvie Float, le niveau de vie
	 * @param puisstr Float, la puissance de travail
	 * @param bse {@link BaseSimple} la base de rattachement.
	 * @throws NullPointerException si nvie==null || puisstr==null || bse==null
	 */
	public Ouvrier(final Float nvie, final Float puisstr,
			final BaseSimple bse) throws NullPointerException {
		super("Ouvrier"+ numinstance,nvie,bse);
		Objects.requireNonNull(puisstr,"Puissance travail null");
		puissancetravail = puisstr;
		numinstance++;
	}
	
	/**
	 * Constructeur : Obtient une instance d'ouvrier.
	 * @param ident String, l'identifiant
	 * @param nvie Float, le niveau de vie
	 * @param puisstr Float, la puissance de travail
	 * @param bse {@link BaseSimple} la base de rattachement.
	 * @throws NullPointerException si ident==null || nvie==null || puisstr==null || bse==null
	 */
	public Ouvrier(final String ident, final Float nvie, final Float puisstr,
			final BaseSimple bse) throws NullPointerException {
		super(ident,nvie,bse);
		Objects.requireNonNull(puisstr,"Puissance travail null");
		puissancetravail = puisstr;
		numinstance++;
	}

	/**
	 * Obtient la puissance de travail.
	 * @return Float, la puissance de travail
	 */
	final public Float getPuissanceTravail() {
		return puissancetravail;
	}
	
	/**
	 * Modifie la puissance de travail.
	 * @param puisstr Float, la nouvelle puissance de travail.
	 * @exception NullPointerException si puisstr==null
	 */
	final public void setPuissanceTravail(final Float puisstr) 
		throws NullPointerException{
		Objects.requireNonNull(puisstr);
		puissancetravail = puisstr;
	}
	
	/**
	 * Obtient une représentation au format chaîne.
	 * @return String, la représentation.
	 */
	@Override
	public String toString() {
		return "Ouvrier("+ puissancetravail + "): " + super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj == this) {
				return true;
			} else if (obj instanceof Ouvrier) {
				Ouvrier ouv = (Ouvrier)obj;
				if (super.equals(ouv) && puissancetravail.equals(ouv.puissancetravail)) {
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
		hash = hash*MULT_HASH + (puissancetravail != null ? puissancetravail.intValue() : 0);
		return hash;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	private static final int MULT_HASH = 3;
}

