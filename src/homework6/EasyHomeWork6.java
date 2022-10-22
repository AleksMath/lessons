package homework6;

public class EasyHomeWork6 {
    public static void main(String[] args) {

        int randomArrays[] = new int[12];
        for (int i = 0; i < randomArrays.length; i++) {
            randomArrays[i] = (int) (Math.random() * 30);
            System.out.print(randomArrays[i] + " ");
        }
        System.out.println();
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < randomArrays.length; i++) {
            if (max <= randomArrays[i]) {
                max = randomArrays[i];
                maxIndex = i;
            }
        }
        System.out.println("Максимальное значение " + max);
        System.out.println("Индекс максимального значения " + maxIndex);
    }
}

