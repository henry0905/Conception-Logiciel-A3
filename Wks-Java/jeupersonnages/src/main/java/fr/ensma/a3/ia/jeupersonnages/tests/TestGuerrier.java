package fr.ensma.a3.ia.jeupersonnages.tests;

import fr.ensma.a3.ia.jeupersonnages.elements.personnages.Guerrier;
import fr.ensma.a3.ia.jeupersonnages.map.BaseSimple;
import fr.ensma.a3.ia.jeupersonnages.map.ECouleur;

public class TestGuerrier {

	public static void main(String[] args) {
		Guerrier guer1 = new Guerrier("Ned", 35.0f, 80f, new BaseSimple("Winterfell", ECouleur.bleu));
		System.out.println(guer1);
		Guerrier guer2 = new Guerrier("Ned", 35.0f, 80f, new BaseSimple("Winterfell", ECouleur.bleu));
		System.out.println("== : " + (guer1==guer2) + " - Equal :" + (guer1.equals(guer2)));
	}
	
}
