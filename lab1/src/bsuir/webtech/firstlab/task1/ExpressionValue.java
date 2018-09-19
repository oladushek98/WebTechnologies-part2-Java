package bsuir.webtech.firstlab.task1;


public class ExpressionValue {

    public double Find(double x, double y) {
//        double x = reader.read();
//        double y = reader.read();
        double result = (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - 2 * x / (1 + Math.pow(x, 2) * Math.pow(y, 2)))) + x;
        //System.out.println(result);
        return result;
    }
}
