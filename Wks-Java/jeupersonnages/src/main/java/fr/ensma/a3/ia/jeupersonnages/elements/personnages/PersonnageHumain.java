package fr.ensma.a3.ia.jeupersonnages.elements.personnages;

import java.util.Objects;
import java.util.logging.Logger;

import fr.ensma.a3.ia.jeupersonnages.map.BaseSimple;

/**
 * Modèle d'un personnage humain.
 * @author michaelrichard
 * @see Personnage
 *
 */
public abstract class PersonnageHumain extends Personnage{
	
	private BaseSimple baseprincipale;
	private final static Logger LOGGER = Logger.getLogger(PersonnageHumain.class.getName());

	/**
	 * Constructeur.
	 * @param ident String, l'identifiant.
	 * @param nvie Float, le niveau de vie
	 * @param bse {@link BaseSimple}, la base de rattachement
	 */
	public PersonnageHumain(final String ident, final Float nvie,
			final BaseSimple bse) {
		super(ident,nvie);
		Objects.requireNonNull(bse,"la base est null");
		baseprincipale = bse;
		baseprincipale.ajoutePersonnage(this);
	}
	
	/**
	 * Faire subir une attaque au personnage.
	 * @param puiss Float, la puissance d'attaque
	 * @throws NullPointerException si puiss==null.
	 */
	public void estAttaque(final Float puiss) throws NullPointerException {
		Objects.requireNonNull(puiss,"Attaque avec puissance null");
		LOGGER.info(getId() + " dit : Aiiiieeee ! ça fait mal !!!!");
		setNiveauVie(getNiveauVie()-(puiss/10.0f));
	}
	
	/**
	 * Provoque le déplacement d'un personnage humain.
	 */
	public void deplacer() {
		LOGGER.info(getId() + ": Je me déplace en marchant");			
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + baseprincipale;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj == this) {
				return true;
			} else if (obj instanceof PersonnageHumain) {
				PersonnageHumain ph = (PersonnageHumain)obj;
				if (super.equals(ph) && baseprincipale.equals(ph.baseprincipale)) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash = 7;
		hash = hash*MULT_HASH + super.hashCode();
		hash = hash*MULT_HASH + (baseprincipale != null ? baseprincipale.hashCode() : 0);
		return hash;
	}
	private static final int MULT_HASH = 3;
}
