package bsuir.webtech.firstlab.task3.ToDouble;


import bsuir.webtech.firstlab.reader.Reader;

public class MyDouble {
    public double value;
    public MyDouble(){};
    public MyDouble(double value){
        this.value = value;
    }
    public double GetDouble(){
        return value;
    }
    public double Add(double h){
        value += h;
        return value;
    }
    public double Set(){
        value = Reader.readDouble();
        return value;
    }
}
