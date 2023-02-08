package TasksUkraineArrays;

import java.util.Scanner;

public class Arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int cnt = sc.nextInt();
            int[][] arr = new int[cnt][];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = new int[i + 1];
            }
            int value = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = value++;
                }
            }
            for (int[] elementSrc : arr) {
                for (int element : elementSrc) {
                    System.out.println(element);
                }
            }
        } else {
            System.out.println("Error");
        }
    }
}
