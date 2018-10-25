package bsuir.webtech.firstlab.task12_13.task13;

import bsuir.webtech.firstlab.task12_13.task12.Books;

public class ProgrammerBook extends Books {

    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int isbn, String lang, int level) {
        super(title, author, price, isbn);
        language = lang;
        this.level = level;
    }

    public String toString(){
        return super.toString() + "Language: " + this.language + "\nLevel: " + Integer.toString(this.level);
    }

    public int hashCode(){
        return super.hashCode() * this.language.hashCode();
    }

    public boolean equals(Object o){
        if (!(o instanceof ProgrammerBook))
            return false;
        else{
            ProgrammerBook progBook = (ProgrammerBook)o;
            return super.equals(progBook) || (progBook.level == this.level) || (progBook.language.equalsIgnoreCase(this.language));
        }
    }
}
