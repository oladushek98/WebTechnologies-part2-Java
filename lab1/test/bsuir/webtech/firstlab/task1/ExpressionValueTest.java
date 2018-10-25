package bsuir.webtech.firstlab.task1;

import bsuir.webtech.firstlab.task1.ExpressionValue.ExpressionValue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpressionValueTest {
    ExpressionValue expressionValue = new ExpressionValue();

    @Test
    public void testFind() {
        double expected = 5.185560456233397;
        double actual = expressionValue.Find(5, 5);
        Assert.assertEquals(actual, expected, "Wrong answer!");
    }

    @Test
    public void testFind1() {
        double expected = 0.5;
        double actual = expressionValue.Find(0, 0);
        Assert.assertEquals(actual, expected, "Wrong answer!");
    }
}