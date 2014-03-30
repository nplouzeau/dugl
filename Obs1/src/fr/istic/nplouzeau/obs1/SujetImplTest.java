package fr.istic.nplouzeau.obs1;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * Author: plouzeau
 * Date: 2014-03-29
 * Time: 16:31
 */
public class SujetImplTest {

	@Test
	public void testNotifier() {

		@SuppressWarnings("unchecked")
		Observateur<String> obs1 = Mockito.mock(Observateur.class);


		Sujet<String> sujet = new SujetImpl<String>();
		Observateur<String> obs2 = new ObservateurImpl<>();
		sujet.abonner(obs1);
		sujet.setValeur("test 1");
		Mockito.verify(obs1).faireMiseAJour(sujet);
	}
}
