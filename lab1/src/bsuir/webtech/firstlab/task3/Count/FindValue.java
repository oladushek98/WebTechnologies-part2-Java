package bsuir.webtech.firstlab.task3.Count;

import bsuir.webtech.firstlab.task3.ToDouble.*;


public class FindValue {

    public double CountValue( MyDouble x, double h){
        double value = Math.tan(x.GetDouble());
        x.Add(h);
        return value;
    }
}
