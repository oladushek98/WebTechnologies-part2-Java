package bsuir.webtech.firstlab.task4.IfPrimeNumber;

import bsuir.webtech.firstlab.task4.Structure.ArrStruct;

public class PrimeNumb {

    public boolean IfPrime(int x){
        boolean prime = true;
        int i = 2;
        while (i <= Math.sqrt(x)){
            if (x % i == 0){
                prime = false;
            }
            i++;
        }
        return prime;
    }
}
