package bsuir.webtech.firstlab.task16.Comparator;

import bsuir.webtech.firstlab.task12_13_14_15.task12.Books;

import java.util.Comparator;

public class  BooksAuthorComparator implements Comparator<Books> {

    public int compare(Books b1, Books b2){
        return b1.getAuthor().compareToIgnoreCase(b2.getAuthor());
    }
}
