package bsuir.webtech.firstlab.task12_13_14_15;

import bsuir.webtech.firstlab.reader.Reader;
import bsuir.webtech.firstlab.task12_13_14_15.task12.Books;

import java.util.InputMismatchException;


public class Runner {

    public static void main(String[] args){
       /* try {
                var book = new Books(Reader.readString(), Reader.readString(), Reader.readInt(), Reader.readInt());
                System.out.println(book.toString());
            //var book1 = new Books(Reader.readString(), Reader.readString(), Reader.readInt());
            //System.out.println(book.clone().toString());
            //System.out.println(book.hashCode());
            //var ball = new Ball(8, "blue");
            //var cs = new ProgrammerBook(Reader.readString(), Reader.readString(), Reader.readInt(), Reader.readString(), Reader.readInt());
            //System.out.println(cs.equals(book));
        }
        catch (InputMismatchException ex){
            System.out.println("Incorrect input!");
        }*/
       var book = new Books("Life", "Pliska", 15, 10);
        var book1 = new Books(null, "Pliska", 15, 10);
        System.out.println(book.equals(book1));



    }
}
