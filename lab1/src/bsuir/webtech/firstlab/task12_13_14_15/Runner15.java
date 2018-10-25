package bsuir.webtech.firstlab.task12_13_14_15;

import bsuir.webtech.firstlab.task12_13_14_15.task12.Books;

import java.util.TreeSet;

public class Runner15 {

    public static void main(String[] args){
        TreeSet<Books> myBooksList = new TreeSet<Books>();

        myBooksList.add(new Books("Life", "Pliska", 15, 12));
        myBooksList.add(new Books("Coffee", "Potter", 40, 11));
        myBooksList.add(new Books("Sleeping", "Gerrard", 40, 10));
        myBooksList.add(new Books("Journey", "Messi", 10, 15));

        for(Books b: myBooksList){
            System.out.println(b.toString());
        }

    }
}
