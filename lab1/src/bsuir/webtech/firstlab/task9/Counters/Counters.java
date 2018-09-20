package bsuir.webtech.firstlab.task9.Counters;

import bsuir.webtech.firstlab.reader.Reader;

import java.util.Scanner;

public class Counters {
    int totalCount;

    public Counters(int count){
        this.totalCount = count;
    }
    public int getTotalCount(){
        return totalCount;
    }
    public int setTotalCount(){
        this.totalCount = Reader.readInt();
        return this.totalCount;
    }



}
