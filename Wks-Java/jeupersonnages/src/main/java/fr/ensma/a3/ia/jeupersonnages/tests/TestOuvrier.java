package fr.ensma.a3.ia.jeupersonnages.tests;

import fr.ensma.a3.ia.jeupersonnages.elements.personnages.Ouvrier;
import fr.ensma.a3.ia.jeupersonnages.map.BaseSimple;
import fr.ensma.a3.ia.jeupersonnages.map.ECouleur;

public class TestOuvrier {

	public static void main(String[] args) {
		Ouvrier ouv1 = new Ouvrier("Bob", 5.0f, 10f, new BaseSimple("Winterfell", ECouleur.bleu));
		System.out.println(ouv1);
		Ouvrier ouv2 = new Ouvrier("Bob", 5.0f, 10f, new BaseSimple("Winterfell", ECouleur.bleu));
		System.out.println("== : " + (ouv1==ouv2) + " - Equal :" + (ouv1.equals(ouv2)));
		try {
			Ouvrier ouv3 = (Ouvrier)ouv1.clone();
			System.out.println("== : " + (ouv1==ouv3) + " - Equal :" + (ouv1.equals(ouv3)));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
