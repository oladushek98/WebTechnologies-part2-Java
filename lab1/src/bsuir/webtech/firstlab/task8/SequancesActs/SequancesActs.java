package bsuir.webtech.firstlab.task8.SequancesActs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequancesActs {

    public static List<Integer> insetIndexes(List<Integer> in, List<Integer> from) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < from.size(); i++) {
            int dex = Collections.binarySearch(in, from.get(i));
            if (dex < 0)
                result.add(-(dex + 1) + i);
            else result.add(dex + i);
        }
        return result;
    }
}
