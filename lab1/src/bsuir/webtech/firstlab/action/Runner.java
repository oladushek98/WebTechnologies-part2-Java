package bsuir.webtech.firstlab.action;

import bsuir.webtech.firstlab.reader.Reader;
//import bsuir.webtech.firstlab.task1.ExpressionValue;
//import bsuir.webtech.firstlab.task2.EitherInOrNot;
//import bsuir.webtech.firstlab.task3.*;
//import bsuir.webtech.firstlab.task3.Count.FindValue;
//import bsuir.webtech.firstlab.task3.ToDouble.MyDouble;
//import bsuir.webtech.firstlab.task4.Output.Print;
import bsuir.webtech.firstlab.task9.BallsAndBoxes.Ball;
import bsuir.webtech.firstlab.task9.BallsAndBoxes.Box;
import bsuir.webtech.firstlab.task9.Counters.Counters;

public class Runner {

    public static void main(String[] args) {
        try {
            Counters count = new Counters(Reader.readInt());
            Box box = new Box();
            for (int i = 0; i < count.getTotalCount(); i++){
                Ball ball = new Ball(Reader.readDouble(), Reader.readString());
                box.setTotalWeight(ball.getWeight());
                if (ball.getColor().equalsIgnoreCase("blue")){
                    box.setBlueAmount();
                }
            }
            System.out.println(box.getTotalWeight() + "     " + box.getBlueAmount());
        }
        catch (Exception ex){
            ex.getLocalizedMessage();
        }

    }
}
