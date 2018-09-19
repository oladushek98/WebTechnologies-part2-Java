package bsuir.webtech.firstlab.task1;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ExpressionValueTest {
    ExpressionValue expressionValue = new ExpressionValue();

    @Test
    public void testFind() {
        double expected = 5.185560456233397;
        double actual = expressionValue.Find(5, 5);
        Assert.assertEquals(actual, expected, "Pidoras");
    }
}