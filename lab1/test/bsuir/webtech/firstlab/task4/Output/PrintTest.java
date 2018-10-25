package bsuir.webtech.firstlab.task4.Output;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class PrintTest {
    Print print = new Print();


    @Test
    public void testResultOutput() {
        ArrayList<Integer> expected = new ArrayList<>();
        int[] arr = {21, 4, 6, 8, 15};
        ArrayList<Integer> actual = print.resultOutput(arr);
        Assert.assertEquals(actual, expected, "Wrong answer!");
    }

    @Test
    public void testResultOutput1(){
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1); expected.add(5);
        int[] arr = {2, 4, 6, 8, 17};
        ArrayList<Integer> actual = print.resultOutput(arr);
        Assert.assertEquals(actual, expected, "Wrong answer!");
    }
}