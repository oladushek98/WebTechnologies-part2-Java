package bsuir.webtech.firstlab.task6;

import bsuir.webtech.firstlab.task5.Counter.Counter;
import bsuir.webtech.firstlab.task6.MatrixCreator.MatrixCreator;

public class Runner {

    public static void main(String[] args) {
        int[] array = {0, 5, 2, 3, 6};
        MatrixCreator creator = new MatrixCreator();
        int[][] arr = creator.buildMatrix(array);
        //System.out.println(creator.buildMatrix(array));
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.print(arr[i][j] + ' ');
            }
            System.out.println();
        }
    }
}
