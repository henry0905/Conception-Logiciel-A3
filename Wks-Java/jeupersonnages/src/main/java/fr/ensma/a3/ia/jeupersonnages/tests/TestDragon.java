package fr.ensma.a3.ia.jeupersonnages.tests;

import fr.ensma.a3.ia.jeupersonnages.elements.personnages.Dragon;

public class TestDragon {

	public static void main(String[] args) {
		Dragon dra1 = new Dragon("Drogo", 1250f, 500f);
		System.out.println(dra1);
		Dragon dra2 = new Dragon("Drogo", 1250f, 500f);
		System.out.println("== : " + (dra1==dra2) + " - Equal :" + (dra1.equals(dra2)));
	}
	
}
