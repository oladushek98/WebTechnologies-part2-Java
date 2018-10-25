package bsuir.webtech.firstlab.task1.ExpressionValue;


public class ExpressionValue {

    public static double Find(double x, double y) {
       // try {
            double result = (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - 2 * x / (1 + Math.pow(x, 2) * Math.pow(y, 2)))) + x;
            return result;
        //}
      //  catch ()
    }
}
