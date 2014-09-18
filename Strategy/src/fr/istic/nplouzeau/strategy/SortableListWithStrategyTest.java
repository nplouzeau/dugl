package fr.istic.nplouzeau.strategy;

import org.junit.Assert;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortableListWithStrategyTest {

    private SortableList testList;

    @org.junit.Before
    public void setUp() throws Exception {
        List<Integer> contents = Arrays.asList(20,8,30,-2,-10);  // Non sorted list of value
        testList = new SortableListWithStrategy(contents);
        ((SortableListWithStrategy)testList).setStrategy(unsortedList -> {
            List<Integer> sortedList = new LinkedList<>(unsortedList);
            Collections.sort(sortedList);
            return sortedList;
        });

    }

    @org.junit.Test
    public void testSort() throws Exception {
        SortableList sortedList = testList.sort();
        // Check if it is really sorted
        int previousValue = Integer.MIN_VALUE;
        for(Integer i : sortedList) {
             Assert.assertTrue(previousValue <= i);
            previousValue = i;
        }
    }

    @org.junit.Test
    public void testAddItem() throws Exception {
        Assert.fail("unimplemented test");
    }
}