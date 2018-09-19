package bsuir.webtech.firstlab.task2;

import bsuir.webtech.firstlab.reader.Reader;

public class EitherInOrNot{

    public boolean Checker(double x, double y){
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
