package bsuir.webtech.firstlab.task4.IfPrimeNumber;


public class PrimeNumb {

    public boolean IfPrime(int x){
        boolean prime = true;
        int i = 2;
        double root = Math.sqrt(x);
        while (i <= root){
            if (x % i == 0){
                prime = false;
            }
            i++;
        }
        return prime;
    }
}
