package homework4;

public class normal {
    public static void main(String[] args) {
        int[][] twoD = new int[11][11];
        int i, j = 1;
        for (i = 1; i < twoD.length; i++)
            for (j = 1; j < twoD[i].length; j++) {
                twoD[i][j] = i*j;
            }
        for (i = 1; i < 11; i++) {
            for (j = 1; j < 11; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}

