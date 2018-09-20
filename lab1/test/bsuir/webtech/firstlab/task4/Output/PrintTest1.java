package bsuir.webtech.firstlab.task4.Output;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PrintTest1 {
    Print print = new Print();
    int[] arr = {0, 6, 1, 8, 9, 14, 86};

    @Test
    public void testPrint() {
        String expected = "No prime numbers!";
        String actual = print.Print(arr);
        Assert.assertEquals(actual, expected, "Incorrect output!");
    }
}