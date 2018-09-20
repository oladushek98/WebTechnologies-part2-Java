package bsuir.webtech.firstlab.task9.BallsAndBoxes;

import bsuir.webtech.firstlab.task3.ToDouble.MyDouble;

import java.awt.*;

public class Ball {
    double weight;
    String color;

    public Ball(double mass, String col){
        this.weight = mass;
        this.color = col;
    }
    public double getWeight(){return weight;}

    public String getColor() {
        return color;
    }


}
