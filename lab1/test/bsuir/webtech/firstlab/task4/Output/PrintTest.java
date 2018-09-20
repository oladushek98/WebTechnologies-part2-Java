package bsuir.webtech.firstlab.task4.Output;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PrintTest {
    Print print = new Print();
    int[] arr = {0, 2, 6, 8, 7, 14, 86};

    @Test
    public void testPrint() {
        String expected = "2 5 ";
        String actual = print.Print(arr);
        Assert.assertEquals(actual, expected, "Incorrect output!");
    }
}