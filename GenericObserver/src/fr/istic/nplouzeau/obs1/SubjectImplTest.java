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

public class SubjectImplTest {
	@SuppressWarnings("unchecked")
	private Observer<String> obs1;
	private Subject<String> subject;

	@Before
	public void setUp() throws Exception {
        // This is executed before each test case execution
        // We build a typical subject and a mock observer
		subject = new SubjectImpl<>();

		obs1 = Mockito.mock(Observer.class);
	}

	@Test
	public void testNotify() throws Exception {
		@SuppressWarnings("unchecked")
        Observer<String> obs2 = Mockito.mock(Observer.class);

		subject.register(obs1);
		subject.register(obs2);

		subject.setValue("test 1");

        // Check that the updates were sent to observers
		Mockito.verify(obs1).doUpdate(subject);
		Mockito.verify(obs2).doUpdate(subject);

	}

	@Test
	public void testRegister() throws Exception {
		subject.register(obs1);
		Assert.assertTrue(subject.isRegistered(obs1));
	}

	@Test
	public void testUnregister() throws Exception {
		subject.register(obs1);
		subject.unregister(obs1);
		Assert.assertFalse(subject.isRegistered(obs1));
	}

	@Test
	public void testSetValue() throws Exception {
		subject.setValue("test");
		Assert.assertEquals("test", subject.getValue());
	}
}
