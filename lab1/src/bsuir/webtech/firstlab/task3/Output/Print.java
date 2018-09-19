package bsuir.webtech.firstlab.task3.Output;

import bsuir.webtech.firstlab.task3.Count.*;
import bsuir.webtech.firstlab.task3.ToDouble.*;

public class Print {

    public void Print(MyDouble x, double y, double h){
        FindValue value = new FindValue();
        while(x.GetDouble() <= y){
            System.out.println("|  " + x.value + "  |  " + value.CountValue(x, h) + "  |");
        }
    }
}
