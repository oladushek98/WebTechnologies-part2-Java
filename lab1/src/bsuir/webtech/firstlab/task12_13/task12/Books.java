package bsuir.webtech.firstlab.task12_13.task12;

import bsuir.webtech.firstlab.reader.Reader;
import bsuir.webtech.firstlab.task12_13.task13.ProgrammerBook;

import java.util.Comparator;

public class Books implements Comparable<Books>{

    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public static void setEdition(int edition) {
        Books.edition = edition;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getIsbn() {
        return isbn;
    }

    public Books(String title, String author, int price, int isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String toString(){
        return "Title: " + this.title
                + "\n" + "Author: " + this.author + "\n"
                + "Price: " + Integer.toString(this.price) + "$\n"
                + "ISBN: " + Integer.toString((this.isbn)) + "\n";
    }

    public boolean equals(Object o){
        if (o == null){
            throw new NullPointerException();
            //return false;
        }
        if (o == this){
            return true;
        }
        if (!(o instanceof Books))
            return false;
        else{
            Books book = (Books)o;
            return book.title.equalsIgnoreCase(this.title) || book.author.equalsIgnoreCase(this.author) || book.price == this.price;
        }
    }

    public int hashCode(){
        return this.title.hashCode() * author.hashCode();
    }

    protected Books(Books that){
        this.author = that.getAuthor();
        this.price = that.getPrice();
        this.title = that.getTitle();
        this.isbn = that.getIsbn();
    }

    public Books clone(){
        return new Books(this);
    }

    public int compareTo(Books b){
        if (b == null)
            throw new NullPointerException();
        if (this.isbn - b.isbn > 0)
            return 1;
        if (this.isbn - b.isbn < 0)
            return -1;
        return 0;
    }

    public static Books[] sort(Books[] arr){
        int len = arr.length;
        Books temp = null;
        for (int i = 0; i < len; i++){
            for(int j = 1; j < (len - i); j++){
                if (arr[j-1].compareTo(arr[j]) == 1){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


}
