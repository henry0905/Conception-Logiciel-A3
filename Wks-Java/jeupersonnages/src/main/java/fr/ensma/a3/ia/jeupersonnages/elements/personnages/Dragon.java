package fr.ensma.a3.ia.jeupersonnages.elements.personnages;

import java.util.Objects;

/**
 * Modèle du Dragon
 * @author michaelrichard
 * @see PersonnageAnimal
 */
public class Dragon extends PersonnageAnimal{
	
	private static int numinstance=1;

	/**
	 * Constructeur : Obtient une instance de dragon avec identifiant par défaut
	 * @param nvie Float, le niveau de vie
	 * @param puissatt Float, la puissance d'attaque
	 * @throws NullPointerException si nvie==null || puissatt==null || bse==null
	 */
	public Dragon(final Float nvie,
			final Float puissatt)
		throws NullPointerException{
		super("Dragon"+numinstance, nvie);
		Objects.requireNonNull(puissatt,"Puissance travail null");
		puissanceAttaque = puissatt;
		numinstance++;
	}
	
	/**
	 * Constructeur : Obtient une instance de dragon
	 * @param ident String, l'identifiant
	 * @param nvie Float, le niveau de vie
	 * @param puissatt Float, la puissance d'attaque
	 * @throws NullPointerException si ident==null || nvie==null || puissatt==null || bse==null
	 */
	public Dragon(final String ident, final Float nvie, final Float puissatt
			) throws NullPointerException {
		super(ident,nvie);
		Objects.requireNonNull(puissatt,"Puissance travail null");
		puissanceAttaque = puissatt;
		numinstance++;
	}
	
	/**
	 * Obtient la puissance d'attaque
	 * @return Float, la puissance.
	 */
	final public Float getPuissanceAttaque() {
		return puissanceAttaque;
	}

	/**
	 * Modifie la puissance d'attaque.
	 * @param puissatt Float, la nouvelle puissance d'attaque
	 * @throws NullPointerException si puissatt==null
	 */
	final public void setPuissanceAttaque(final Float puissatt) 
		throws NullPointerException{
		Objects.requireNonNull(puissatt);
		puissanceAttaque = puissatt;
	}
	
	/**
	 * Obtient une représentation au format chaîne.
	 * @return String, la représentation.
	 */
	@Override
	public String toString() {
		return "Dragon("+ puissanceAttaque + "): " + super.toString();
	}


}
