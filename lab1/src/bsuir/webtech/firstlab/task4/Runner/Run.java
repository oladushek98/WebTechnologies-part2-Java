package bsuir.webtech.firstlab.task4.Runner;

import bsuir.webtech.firstlab.reader.Reader;
//import bsuir.webtech.firstlab.task4.IfPrimeNumber.PrimeNumb;
import bsuir.webtech.firstlab.task4.Output.Print;

import java.util.InputMismatchException;

public class Run {

    public static void main(String[] args){
        try {
            System.out.print("Enter the count of array members: ");
            int count = Reader.readInt();
            int[] arr = new int[count];
            for (int i = 0; i < count; i++){
                arr[i] = Reader.readInt();
            }
            Print result = new Print();
            System.out.println(result.resultOutput(arr));
        }
        catch (InputMismatchException ex){
            System.out.println("Incorrect input!");
        }
    }
}
