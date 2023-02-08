package TasksUkraineArrays;

import java.util.Scanner;
import java.util.Arrays;

public class Arr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] arrLim = new int[5][2];
        for (int i = 0; i < arr.length; i++) {
            arrLim[i][0] = arr[i][0];
            arrLim[i][1] = arr[i][0];
            for (int element : arr[i]) {
                if (element > arrLim[i][0]) {
                    arrLim[i][0] = element;
                }
                if (element < arrLim[i][1]) {
                    arrLim[i][1] = element;
                }
            }
        }
        System.out.println(Arrays.deepToString(arrLim));
    }
}
