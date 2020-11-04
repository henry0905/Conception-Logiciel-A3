package fr.ensma.a3.ia.jeupersonnages.elements.personnages;

import java.util.logging.Logger;

/**
 * Modèle d'un personnage animal.
 * @author michaelrichard
 * @see Personnage
 *
 */
public abstract class PersonnageAnimal extends Personnage{
	
	private final static Logger LOGGER = Logger.getLogger(PersonnageAnimal.class.getName());

	/**
	 * Constructeur.
	 * @param ident String, l'identifiant.
	 * @param nvie Float, le niveau de vie.
	 */
	public PersonnageAnimal(final String ident, final Float nvie) {
		super(ident, nvie);
	}
	
	/**
	 * Provoque le déplacement d'un personnage animal.
	 */
	public void deplacer() {
		LOGGER.info(getId() + ": Je me déplace en volant");			
	}
}
