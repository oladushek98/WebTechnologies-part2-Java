package bsuir.webtech.firstlab.action;

import bsuir.webtech.firstlab.reader.Reader;
import bsuir.webtech.firstlab.task1.ExpressionValue;
import bsuir.webtech.firstlab.task2.EitherInOrNot;

public class Runner {

    public static void main(String[] args) {
        double x = Reader.readDouble();
        double y = Reader.readDouble();
        ExpressionValue expressionValue = new ExpressionValue();
        System.out.println(expressionValue.Find(x, y));
    }
}
