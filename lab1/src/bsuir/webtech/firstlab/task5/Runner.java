package bsuir.webtech.firstlab.task5;

import bsuir.webtech.firstlab.task5.Counter.Counter;

public class Runner {

    public static void main(String[] args) {
        int[] array = {0, 5, 2, 3, 6};
        Counter searcher = new Counter();
        System.out.println(searcher.findDeletedElementsCount(array));
    }
}
