package bsuir.webtech.firstlab.reader;

import java.util.Scanner;

public class Reader {

    public static double readDouble(){
        Scanner in = new Scanner(System.in);
        double result = in.nextDouble();
        return result;
    }

    public static int readInt(){
        Scanner in = new Scanner(System.in);
        int result = in.nextInt();
        return result;
    }

    public static  String readString(){
        Scanner in = new Scanner(System.in);
        String result = in.next();
        return result;
    }


}
