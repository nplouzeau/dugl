package fr.istic.nplouzeau.obs1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Author: plouzeau
 * Date: 2014-03-29
 * Time: 16:31
 */

public class SujetImplTest {
	@SuppressWarnings("unchecked")
	private Observateur<String> obs1;
	private Sujet<String> sujet;

	@Before
	public void setUp() throws Exception {
		sujet = new SujetImpl<>();

		obs1 = Mockito.mock(Observateur.class);
	}

	@Test
	public void testNotifier() throws Exception {
		@SuppressWarnings("unchecked")
		Observateur<String> obs2 = Mockito.mock(Observateur.class);

		sujet.abonner(obs1);
		sujet.abonner(obs2);

		sujet.setValeur("test 1");

		Mockito.verify(obs1).faireMiseAJour(sujet);
		Mockito.verify(obs2).faireMiseAJour(sujet);

	}

	@Test
	public void testAbonner() throws Exception {
		sujet.abonner(obs1);
		Assert.assertTrue(sujet.estAbonné(obs1));
	}

	@Test
	public void testDésabonner() throws Exception {
		sujet.abonner(obs1);
		sujet.désabonner(obs1);
		Assert.assertFalse(sujet.estAbonné(obs1));
	}

	@Test
	public void testSetValeur() throws Exception {
		sujet.setValeur("essai");
		Assert.assertEquals("essai", sujet.getValeur());
	}
}
