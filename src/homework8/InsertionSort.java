package homework8;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int [] array  = {43, 14, 35, 20, 5};

        for (int i = 0; i < array.length; i++){
        System.out.print(array [i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        System.out.print(Arrays.toString(array));
    }
}
