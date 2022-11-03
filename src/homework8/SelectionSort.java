package homework8;

public class SelectionSort {
    public static void main(String[] args) {

        int [] array  = {56, 23, 39, 12, 7};

        for (int i = 0; i < array.length; i++){
        System.out.print(array [i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int swap = array[i];
            array[i] = array[min];
            array[min] = swap;
            System.out.print(array [i] + " ");
        }
    }
}
