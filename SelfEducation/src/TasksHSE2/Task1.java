package TasksHSE2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int value;
        if (arr.length % 2 == 0) {
            value = (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
        } else {
            value = arr[arr.length / 2];
        }
        System.out.println(value);
    }
}
