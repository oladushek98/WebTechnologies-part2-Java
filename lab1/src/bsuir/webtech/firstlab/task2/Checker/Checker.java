package bsuir.webtech.firstlab.task2.Checker;

public class Checker {

    public boolean check(double x, double y){
        boolean in = false;

        if ((y <= 5) && (y >= -3)){
            if ((y >= 0) && (x >= -4) && (x <= 4))
                in = true;
            if ((y <= 0) && (x >= -6) && (x <= 6))
                in = true;
        }
        return in;
    }
}
