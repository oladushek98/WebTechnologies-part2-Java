package bsuir.webtech.firstlab.task9.Runner;

import bsuir.webtech.firstlab.reader.Reader;
import bsuir.webtech.firstlab.task9.BallsAndBoxes.Ball;
import bsuir.webtech.firstlab.task9.BallsAndBoxes.Box;
import bsuir.webtech.firstlab.task9.Counters.Counters;

import java.util.InputMismatchException;

public class Run {

    public static void main(String[] args){
        try {
            Counters count = new Counters(Reader.readInt());
            Box box = new Box();
            Ball ball;
            for (int i = 0; i < count.getTotalCount(); i++){
                ball = new Ball(Reader.readDouble(), Reader.readString());
                box.addTotalWeight(ball.getWeight());
                if (ball.getColor().equalsIgnoreCase("blue")){
                    box.incBlueAmount();
                }
            }
            System.out.println(box.getTotalWeight() + "     " + box.getBlueAmount());
        }
        catch (InputMismatchException ex){
            System.out.println("Incorrect input!");
        }
    }
}
