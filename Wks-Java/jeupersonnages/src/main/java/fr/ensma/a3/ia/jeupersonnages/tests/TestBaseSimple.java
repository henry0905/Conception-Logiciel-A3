package fr.ensma.a3.ia.jeupersonnages.tests;

import fr.ensma.a3.ia.jeupersonnages.map.BaseSimple;
import fr.ensma.a3.ia.jeupersonnages.map.ECouleur;

public class TestBaseSimple {

	public static void main(String[] args) {
		BaseSimple bse1 = new BaseSimple("Winterfell", ECouleur.bleu);
		System.out.println(bse1);
		BaseSimple bse2 = new BaseSimple("Port Réal", ECouleur.rouge);
		BaseSimple bse3 = new BaseSimple("Winterfell", ECouleur.bleu);
		System.out.println("== : " + (bse1==bse3) + " - Equal :" + (bse1.equals(bse3)));
		System.out.println("== : " + (bse1==bse2) + " - Equal :" + (bse1.equals(bse2)));
		try {
			BaseSimple bse4 = (BaseSimple)bse2.clone();
			System.out.println("== : " + (bse2==bse4) + " - Equal :" + (bse2.equals(bse4)));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	
}
