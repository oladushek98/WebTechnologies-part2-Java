package bsuir.webtech.firstlab.task2.Runner;

import bsuir.webtech.firstlab.reader.Reader;
import bsuir.webtech.firstlab.task2.Checker.Checker;

public class Run {

    public static void main(String[] args){
        double x = Reader.readDouble();
        double y = Reader.readDouble();
        Checker in = new Checker();
        System.out.println(in.check(x, y));
    }
}
