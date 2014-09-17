package fr.istic.nplouzeau.strategy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/**
 * Created by plouzeau on 2014-09-17.
 */
public class SortableListWithStrategy implements SortableList {

    public Function<List<Integer>, List<Integer>> getStrategy() {
        return strategy;
    }

    public void setStrategy(Function<List<Integer>, List<Integer>> strategy) {
        this.strategy = strategy;
    }

    private Function<List<Integer>, List<Integer>> strategy;
    private List<Integer> integerList;


    public SortableListWithStrategy(List<Integer> integerList) {
        super();
        this.integerList = new ArrayList<>(integerList);
    }

    @Override
    public SortableList sort() {
        // This is not in place sorting
        return new SortableListWithStrategy(strategy.apply(integerList));
    }

    @Override
    public void addItem(int item) {
        integerList.add(item);
    }


    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<Integer> iterator() {
        return integerList.iterator();
    }
}
