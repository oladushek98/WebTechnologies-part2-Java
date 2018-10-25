package bsuir.webtech.firstlab.task3.Output;

import bsuir.webtech.firstlab.task3.Count.*;

import static java.lang.System.exit;

public class Print {

    public static void print(double x, double y, double h){
        FindValue value = new FindValue();
        if (h == 0){
            System.out.println("Enter not 0 for h!");
            exit(1);
        }
        while(x <= y){
            System.out.println("|  " + x + "  |  " + value.CountValue(x) + "  |");
            x += h;
        }
    }
}
