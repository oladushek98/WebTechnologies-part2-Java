package bsuir.webtech.firstlab.task16.Comparator;

import bsuir.webtech.firstlab.task12_13_14_15.task12.Books;

import java.util.Comparator;

public class BooksPriceComparator implements Comparator<Books> {

    public int compare(Books b1, Books b2){

        if (b1.getPrice() > b2.getPrice())
            return 1;
        if (b1.getPrice() < b2.getPrice())
            return -1;
        return 0;
    }
}
