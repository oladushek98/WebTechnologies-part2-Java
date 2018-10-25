package bsuir.webtech.firstlab.task16;

import bsuir.webtech.firstlab.task12_13_14_15.task12.Books;
import bsuir.webtech.firstlab.task16.Comparator.BooksAuthorComparator;
import bsuir.webtech.firstlab.task16.Comparator.BooksPriceComparator;
import bsuir.webtech.firstlab.task16.Comparator.BooksTitleComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class Runner {

    public static void main(String[] args){
        //Comparator<Books> bcomp = new BooksAuthorComparator();
        //Comparator<Books> bcomp = new BooksAuthorComparator().thenComparing(new BooksTitleComparator());
        //Comparator<Books> bcomp = new BooksTitleComparator().thenComparing(new BooksAuthorComparator());
        Comparator<Books> bcomp = new BooksAuthorComparator().thenComparing(new BooksTitleComparator()).thenComparing(new BooksPriceComparator());
        TreeSet<Books> books = new TreeSet(bcomp);
        books.add(new Books("Life", "Pliska", 15, 12));
        books.add(new Books("Coffee", "Potter", 40, 11));
        books.add(new Books("Sleeping", "Potter", 40, 10));
        books.add(new Books("Life", "Pliska", 10, 15));

        for(Books b : books){
            System.out.println(b.toString());
        }
    }
}
