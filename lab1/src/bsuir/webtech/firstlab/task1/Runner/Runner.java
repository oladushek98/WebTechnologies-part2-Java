package bsuir.webtech.firstlab.task1.Runner;

import bsuir.webtech.firstlab.reader.Reader;
import bsuir.webtech.firstlab.task1.ExpressionValue.ExpressionValue;

import java.util.InputMismatchException;

public class Runner {

    public static void main(String[] args){
        try {
            double x = Reader.readDouble();
            double y = Reader.readDouble();
            System.out.println(ExpressionValue.Find(x, y));
        }
        catch (InputMismatchException ex){
            System.out.println("Incorret input!");
        }
    }
}
