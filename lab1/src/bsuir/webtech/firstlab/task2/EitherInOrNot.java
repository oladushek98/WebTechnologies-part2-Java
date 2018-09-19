package bsuir.webtech.firstlab.task2;

import bsuir.webtech.firstlab.reader.Reader;

public class EitherInOrNot {


    public boolean Checker(){
//       double x =  Reader.readDouble();
//       double y = Reader.readDouble();
       boolean in = false;
       if ((x < 6) && (x > -6) && (y < 0) && (y > -3)){
           in = true;
       }
       if ((x < 4) && (x > -4) && (y > 0) && (y < 5)){
           in = true;
       }
       return in;
    }

}
