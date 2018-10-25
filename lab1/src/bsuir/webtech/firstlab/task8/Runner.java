package bsuir.webtech.firstlab.task8;

import bsuir.webtech.firstlab.task8.SequancesActs.SequancesActs;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<Integer> in = new ArrayList<Integer>() {
            {add(-10); add(2); add(2); add(5); add(10); add(88);}
        };
        List<Integer> from = new ArrayList<Integer>() {
            {add(-1); add(3); add(4); add(7); add(99);}
        };
        List<Integer> indexes = SequancesActs.insetIndexes(in, from);

        System.out.println("Where to insert" + indexes);

        for (int i = 0; i < indexes.size(); i++) {
            in.add(indexes.get(i), from.get(i));
        }
        System.out.println("After insert "+ in);
    }
}
