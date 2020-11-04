package fr.ensma.a3.ia.jeupersonnages.elements.groupement;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import fr.ensma.a3.ia.jeupersonnages.elements.comportement.IDeplacable;

/**
 * Modélise une troupe.
 * @author michaelrichard
 * @see IDeplacable
 */
public class Troupe implements IDeplacable {
	
	private String idTroupe;
	private List<IDeplacable> laTroupe;

	/**
	 * Obtient une instance de Troupe avec 1 élément.
	 * @param id, l'identifiant de la troupe
	 * @param elem, le premier élément de la troupe.
	 */
	public Troupe(final String id, final IDeplacable elem) {
		Objects.requireNonNull(elem,"New : l'élément ne peut être null ...");
		Objects.requireNonNull(id,"New : l'identifiant ne peut être null ...");
		laTroupe = new LinkedList<IDeplacable>();
		laTroupe.add(elem);
		idTroupe = id;
	}

	/**
	 * Retourne le nombre d'éléments de la troupe
	 * @return le nombre d'éléments
	 */
	public int nbElements() {
		return laTroupe.size();
	}

	/**
	 * Ajoute un élément à la troupe.
	 * @param elem élément à ajouter
	 */
	public void ajouterElement(final IDeplacable elem) {
		Objects.requireNonNull(elem,"ajout : l'élément ne peut être null ...");
		laTroupe.add(elem);
	}

	/**
	 * Retire elem de la liste
	 * @param elem l'élément à retirer
	 * @throws TroupeVideException 
	 * si nbElement == 0 après le retrait.
	 */
	public void retirerElement(final IDeplacable elem) throws TroupeVideException {
		Objects.requireNonNull(elem,"retrait : l'élément ne peut être null ...");	
		if (laTroupe.contains(elem)) {
			laTroupe.remove(elem);
		} else {
			throw new ElemNotInTroupeException(elem + "n'est pas dans " + idTroupe);
		}
		if (nbElements() == 0) {
			throw new TroupeVideException();
		}
	}
	
	/**
	 * Provoque le déplacement des éléments de la troupe.
	 */
	@Override
	public void deplacer() {
		for (IDeplacable dep : laTroupe) {
			dep.deplacer();
		}
	}
	
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("==" + idTroupe + "(" + nbElements() +
				")" + "==\n");
		for (IDeplacable dep : laTroupe) {
			chaine.append(dep);
			chaine.append("\n---------\n");
		}
		return chaine.toString();
	}
}
