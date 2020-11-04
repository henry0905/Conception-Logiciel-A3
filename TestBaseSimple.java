package fr.ensma.a3.ia.jeupersonnages.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestBaseSimple {

	private BaseSimple bse,bse2;
	
	@Before
	public void initTest() {
		bse = new BaseSimple("Winterfell", ECouleur.bleu);
		bse2 = new BaseSimple("Winterfell", ECouleur.bleu);
	}
	
	@Test
	public void t01_testToString() {
		Assert.assertEquals("Winterfell(bleu(30)-0)",bse.toString());
	}

	@Test(expected = NullPointerException.class)
	public void t00_testConstruct() {
		BaseSimple bse = new BaseSimple(null, ECouleur.rouge);
	}
	
	@Test(expected = NullPointerException.class)
	public void t00_testConstruct2() {
		BaseSimple bse = new BaseSimple("Winterfell", null);
	}

	
	@Test
	public void t02_testEquals() {
		Assert.assertTrue(bse.equals(bse2));
		Assert.assertTrue(bse2.equals(bse));
		Assert.assertTrue(bse.equals(bse));
		Assert.assertFalse(bse.equals(null));
		Assert.assertFalse(bse.equals(new Object()));
		BaseSimple bse3 = new BaseSimple("Winterfell", ECouleur.rouge);
		Assert.assertFalse(bse.equals(bse3));
		bse3 = new BaseSimple("Herbiers", ECouleur.bleu);
		Assert.assertFalse(bse.equals(bse3));
		bse3 = new BaseSimple("Herbiers", ECouleur.vert);
		Assert.assertFalse(bse.equals(bse3));
	}
	
	@Test
	public void t03_testHashCode() {
		Assert.assertEquals(bse.hashCode(), bse2.hashCode());
	}
	
	@Test
	public void t04_testGet() {
		Assert.assertEquals("Winterfell",bse.getNom());
		Assert.assertEquals(ECouleur.bleu,bse.getCouleur());
	}
	
	
}
