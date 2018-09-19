package bsuir.webtech.firstlab.task1;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ExpressionValueTest1 {
    ExpressionValue exp = new ExpressionValue();

    @Test
    public void testFind() {
        double expected = 0.5;
        double actual = exp.Find(0, 0);
        Assert.assertEquals(actual, expected, "Wrong answer!");
    }
}