package bsuir.webtech.firstlab.task16.Comparator;

import bsuir.webtech.firstlab.task12_13.task12.Books;

import java.util.Comparator;

public class  BooksTitleComparator implements Comparator<Books> {

    public int compare(Books b1, Books b2){

        return b1.getTitle().compareToIgnoreCase(b2.getTitle());
    }

}


