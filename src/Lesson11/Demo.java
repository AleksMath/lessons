package Lesson11;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int [] array = {4, 2, 1, 5, 3};
        SortUtil.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
