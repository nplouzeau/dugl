package fr.istic.nplouzeau.strategy;

import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class SortableListWithStrategyTest {

    private SortableList testList;

    @org.junit.Before
    public void setUp() throws Exception {
        List<Integer> contents = Arrays.asList(20,8,30);  // Non sorted list of value
        testList = new SortableListWithStrategy(contents);
        // We use a broken strategy, to check testSort
        ((SortableListWithStrategy)testList).setStrategy(unsortedList -> unsortedList);

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