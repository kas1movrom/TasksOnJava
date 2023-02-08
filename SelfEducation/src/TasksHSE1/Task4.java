package TasksHSE1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int cnt = sc.nextInt();
            int[] arr = new int[cnt];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int[][] arr1 = new int[cnt][];
            for (int i = 0; i < arr1.length; i++) {
                int j = 0;
                int value = arr[i];
                while (value != 0) {
                    j++;
                    value /= 10;
                }
                arr1[i] = new int[j];
            }
            for (int i = 0; i < arr.length; i++) {
                int j = 0;
                int value = arr[i];
                while (value != 0) {
                    int p = value % 10;
                    arr1[i][j] = p;
                    j++;
                    value /= 10;
                }
            }
            int n = 0;
            for (int i = 0; i < arr1.length; i++) {
                boolean flag = false;
                for (int j = 0; j + 5 < arr1[i].length; j++) {
                    if ((arr1[i][j] == arr1[i][j + 5]) && (arr1[i][j + 1] == arr1[i][j + 4]) &&
                            (arr1[i][j + 2] == arr1[i][j + 3]) && (arr1[i][j] != arr1[i][j + 1]) &&
                            (arr1[i][j] != arr1[i][j + 2]) && (arr1[i][j + 1] != arr1[i][j + 2])) {
                        flag = true;
                    }
                }
                for (int j = 0; j + 3 < arr1[i].length; j++) {
                    if ((arr1[i][j] == arr1[i][j + 3]) && (arr1[i][j + 1] == arr1[i][j + 2]) &&
                            (arr1[i][j] != arr1[i][j + 1])) {
                        flag = true;
                    }
                }
                if (flag) {
                    n++;
                }
            }
            System.out.println(n);
        } else {
            System.out.println("Error");
        }
    }
}
