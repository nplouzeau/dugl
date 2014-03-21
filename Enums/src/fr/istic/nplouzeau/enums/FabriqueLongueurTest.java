package fr.istic.nplouzeau.enums;

import org.junit.Assert;
import org.junit.Test;

/**
 * Author: plouzeau
 * Date: 2014-03-21
 * Time: 15:16
 */
public class FabriqueLongueurTest {
	@Test
	public void testCréerPouce() throws Exception {
		Longueur lPouce = FabriqueLongueur.créer(1.0, UnitéLongueur.POUCE);
		Assert.assertTrue(java.lang.Math.abs(lPouce.getValeurNumérique(UnitéLongueur.MÈTRE) - 2.54E-02) < 1E-30);

	}

	@Test
	public void testAjouter1() throws Exception {

		Longueur l1 = FabriqueLongueur.créer(1.0E01, UnitéLongueur.PIED);
		Longueur l2 = FabriqueLongueur.créer(1.0E01, UnitéLongueur.PIED);

		Assert.assertTrue(java.lang.Math.abs(l1.ajouter(l2).getValeurNumérique(UnitéLongueur.PIED)
				                           - 2E+01) < 1E-30);
	}
}