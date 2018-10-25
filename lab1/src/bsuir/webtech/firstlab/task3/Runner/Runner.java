package bsuir.webtech.firstlab.task3.Runner;

import bsuir.webtech.firstlab.reader.Reader;
import bsuir.webtech.firstlab.task3.Output.Print;

import java.util.InputMismatchException;

public class Runner {

    public static void main(String[] args){
        try {
            Print.print(Reader.readDouble(), Reader.readDouble(), Reader.readDouble());
        }
        catch (InputMismatchException ex){
            System.out.println("Incorrect input!");
        }
    }
}
