package fr.ensma.a3.ia.jeupersonnages.elements.personnages;

import java.util.Objects;
import java.util.logging.Logger;

import fr.ensma.a3.ia.jeupersonnages.map.BaseSimple;

/**
 * Modèle d'un Guerrier
 * @author michaelrichard
 * @see PersonnageHumain
 */
public class Guerrier extends PersonnageHumain{

	private static int numinstance = 1; 
	private final static Logger LOGGER = Logger.getLogger(Guerrier.class.getName());
	
	/**
	 * Constructeur : Obtient une instance de guerrier avec identifiant par défaut
	 * @param nvie Float, le niveau de vie
	 * @param puissatt Float, la puissance d'attaque
	 * @param bse {@link BaseSimple}, la base de rattachement.
	 * @throws NullPointerException si nvie==null || puissatt==null || bse==null
	 */
	public Guerrier(final Float nvie,
			final Float puissatt, final BaseSimple bse)
		throws NullPointerException{
		super("Guerrier"+numinstance, nvie, bse);
		Objects.requireNonNull(puissatt,"Puissance travail null");
		puissanceAttaque = puissatt;
		numinstance++;
	}
	
	/**
	 * Constructeur : Obtient une instance de guerrier
	 * @param ident String, l'identifiant
	 * @param nvie Float, le niveau de vie
	 * @param puissatt Float, la puissance d'attaque
	 * @param bse {@link BaseSimple}, la base de rattachement.
	 * @throws NullPointerException si ident==null || nvie==null || puissatt==null || bse==null
	 */
	public Guerrier(final String ident, final Float nvie, final Float puissatt,
			final BaseSimple bse) throws NullPointerException {
		super(ident,nvie,bse);
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
		return "Guerrier("+ puissanceAttaque + "): " + super.toString();
	}
	
	/***
	 * Provoque l'attaque du guerrier sur le personnage
	 * @param qui {@link PersonnageHumain} le personnage attaqué
	 */
	public void aLAttaque(PersonnageHumain qui) {
		LOGGER.info(getId() + ": Je vais attaquer " + qui.getId());
		qui.estAttaque(puissanceAttaque);
	}
	
}
