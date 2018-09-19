package bsuir.webtech.firstlab.action;

import bsuir.webtech.firstlab.reader.Reader;
import bsuir.webtech.firstlab.task1.ExpressionValue;
import bsuir.webtech.firstlab.task2.EitherInOrNot;
import bsuir.webtech.firstlab.task3.*;
import bsuir.webtech.firstlab.task3.Count.FindValue;
import bsuir.webtech.firstlab.task3.Output.Print;
import bsuir.webtech.firstlab.task3.ToDouble.MyDouble;

public class Runner {

    public static void main(String[] args) {
        double x = Reader.readDouble();
        double y = Reader.readDouble();
        EitherInOrNot checker = new EitherInOrNot();
        System.out.println(checker.Checker(x, y));
    }
}
