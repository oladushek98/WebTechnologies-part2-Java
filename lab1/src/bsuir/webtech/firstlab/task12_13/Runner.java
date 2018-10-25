package bsuir.webtech.firstlab.task12_13;

import bsuir.webtech.firstlab.reader.Reader;
import bsuir.webtech.firstlab.task12_13.task12.Books;
import bsuir.webtech.firstlab.task12_13.task13.ProgrammerBook;
import bsuir.webtech.firstlab.task9.BallsAndBoxes.Ball;

import java.util.InputMismatchException;


public class Runner {

    public static void main(String[] args){
        try {
            //var book = new Books(Reader.readString(), Reader.readString(), Reader.readInt());
            //System.out.println(book.toString());
            //var book1 = new Books(Reader.readString(), Reader.readString(), Reader.readInt());
            //System.out.println(book.clone().toString());
            //System.out.println(book.hashCode());
            //var ball = new Ball(8, "blue");
            //var cs = new ProgrammerBook(Reader.readString(), Reader.readString(), Reader.readInt(), Reader.readString(), Reader.readInt());
            //System.out.println(cs.equals(book));
            Books book;
            Books[] arr = new Books[5];
            Books[] sortArr = new Books[5];
            for (int i = 0; i < 5; i++) {
                book = new Books(Reader.readString(), Reader.readString(), Reader.readInt(), Reader.readInt());
                arr[i] = book;
            }
            sortArr = Books.sort(arr);
            for (int i = 0; i < 5; i++) {
                System.out.println(sortArr[i].toString());
            }
        }
        catch (InputMismatchException ex){
            System.out.println("Incorrect input!");
        }

    }
}
