package homework4;

public class arrays {
    public static void main(String[] args) {
        int[] table = new int[5];
        table [0] = 10;
        System.out.println(table[0]);
        System.out.println(table[1]);
        String [] strings = new String[3];
        strings [0] = "Hello";
        strings [1] = "Bye";
        strings [2] = "Java";
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();
        for (String string:strings){
            System.out.println(string);
        }
        int [] numbers1 = {1, 2, 3};
        int sum = 0;
        for (int x:numbers1){
            sum = x+sum;
        }
        System.out.println();
        System.out.println(sum);
    }
}
