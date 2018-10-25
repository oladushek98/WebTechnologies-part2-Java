package bsuir.webtech.firstlab.task5.Counter;

public class Counter {

    public int findDeletedElementsCount(int[] array) {
        int arrayLength = array.length;
        int[] maxSequence = new int[arrayLength];
        for (int i = 0; i < arrayLength; ++i) {
            maxSequence[i] = 1;
            for (int j = 0; j < i; ++j)
                if (array[j] < array[i])
                    maxSequence[i] = Math.max(maxSequence[i], 1 + maxSequence[j]);
        }

        int maxSequenceLength = maxSequence[0];
        for (int i = 0; i < arrayLength; ++i)
            maxSequenceLength = Math.max(maxSequenceLength, maxSequence[i]);

        return arrayLength - maxSequenceLength;
    }
}
