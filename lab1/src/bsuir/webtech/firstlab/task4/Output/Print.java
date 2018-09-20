package bsuir.webtech.firstlab.task4.Output;

import bsuir.webtech.firstlab.task4.IfPrimeNumber.PrimeNumb;

public class Print {

    public String Print(int[] arr){
        PrimeNumb prime = new PrimeNumb();
        String res = "";
        boolean arePrime = false;
        for(int i = 0; i < arr.length; i++){
            if ((arr[i] != 0) && (arr[i] != 1))
                if (prime.IfPrime(arr[i])){
                    // System.out.print((i+1) + " ");
                    res += Integer.toString(i+1) + " ";
                    arePrime = true;
                }
        }
        if (!arePrime)
            //System.out.println("No prime numbers!");
            res = "No prime numbers!";
        return res;
    }
}
