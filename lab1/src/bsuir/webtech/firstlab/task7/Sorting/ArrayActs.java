package bsuir.webtech.firstlab.task7.Sorting;

public class ArrayActs {

    public static int[] sort(int[] arr){
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
                if (i > 0)
                    i--;
            } else {
                i++;
            }
        }
        return arr;
    }
}
