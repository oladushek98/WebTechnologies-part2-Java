package bsuir.webtech.firstlab.task9.Runner;

import bsuir.webtech.firstlab.task9.BallsAndBoxes.Ball;
import bsuir.webtech.firstlab.task9.BallsAndBoxes.Box;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class RunTest {
    Box box = new Box();
    Ball ball;

    @Test
    public void testMain() {
        double expected = 10;
        double actual = box.getTotalWeight();
        Assert.assertEquals(actual, expected, "Wrong answer!");
    }
}