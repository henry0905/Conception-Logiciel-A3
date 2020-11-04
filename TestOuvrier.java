package fr.ensma.a3.ia.jeupersonnages.elements.personnages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import fr.ensma.a3.ia.jeupersonnages.map.BaseSimple;
import fr.ensma.a3.ia.jeupersonnages.map.ECouleur;
import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;
import mockit.VerificationsInOrder;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestOuvrier {

	private Ouvrier hodor, hodor2, ouvrier1;

	@Mocked
	private BaseSimple labase, labase2;

	@Before
	public void initTest() {
		ouvrier1 = new Ouvrier(200.0f, 150.0f, labase);
		hodor = new Ouvrier("Hodor", 500.0f, 250.0F, labase);
	}

	@Test
	public void T05_testToString() {
		new Expectations() {
			{
				labase.toString();
				result = "laBaseSimulee";
				times = 1;
			}
		};
		Assert.assertEquals("Ouvrier(250.0): Hodor - 500.0 - laBaseSimulee", hodor.toString());
	}
}
