package fr.istic.nplouzeau.observabletest;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Observable;
import java.util.Observer;

public class SimpleObservableTest {

    private SimpleObservable simpleObservable;

    private Observer mock1;
    private Observer mock2;

    private Collection<Observer>  notifiedObservers;
    private MyObserverMock myObserverMock1;

    private class MyObserverMock implements Observer {

        @Override
        public void update(Observable o, Object arg) {
                   notifiedObservers.add(this);
        }
    }
    @org.junit.Before
    public void setUp() throws Exception {

        simpleObservable = new SimpleObservable();

        mock1 = Mockito.mock(Observer.class);
        mock2 = Mockito.mock(Observer.class);
        myObserverMock1 = new MyObserverMock();

        notifiedObservers = new ArrayList<>();

    }

    @Test
    public void testNotification() throws Exception {
        simpleObservable.addObserver(mock1);
        simpleObservable.addObserver(mock2);
        simpleObservable.addObserver(myObserverMock1);

        simpleObservable.setValue(10);

        Mockito.verify(mock1).update(simpleObservable, null);
        Mockito.verify(mock2).update(simpleObservable, null);

        Assert.assertTrue(notifiedObservers.contains(myObserverMock1));
    }
}

