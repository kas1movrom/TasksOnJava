package TasksHSE2;

import java.util.Scanner;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arrCpy = new int[cnt];
        System.arraycopy(arr, 0, arrCpy, 0, cnt);
        Arrays.sort(arr);
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arrCpy[i]) {
                n++;
            }
        }
        System.out.println(n);
    }
}
