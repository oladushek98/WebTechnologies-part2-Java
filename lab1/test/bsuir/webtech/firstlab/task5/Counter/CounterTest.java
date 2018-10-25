package bsuir.webtech.firstlab.task5.Counter;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CounterTest {

    @Test
    public void testFindDeletedElementsCount() {
        int expected = 1;
        Counter searcher = new Counter();
        int[] workArray = new int[] {0,5,2,3,6};
        int actual = searcher.findDeletedElementsCount(workArray);
        Assert.assertEquals(actual, expected, "Wrong method!");
    }
}