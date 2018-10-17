package bsuir.webtech.firstlab.task4.Output;

import bsuir.webtech.firstlab.task4.IfPrimeNumber.PrimeNumb;

import java.util.ArrayList;

public class Print {

    public ArrayList<Integer> resultOutput(int[] arr){
        PrimeNumb prime = new PrimeNumb();
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if ((arr[i] != 0) && (arr[i] != 1))
                if (prime.IfPrime(arr[i])){
                    res.add(i+1);
                }
        }

        return res;
    }
}
