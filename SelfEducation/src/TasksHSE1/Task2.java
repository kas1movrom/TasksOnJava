package TasksHSE1;

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
        int amount = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == arr[arr.length - i - 1]) {
                amount++;
            }
        }
        if (amount == (arr.length / 2)) {
            int cntPol = 0;
            for (int element : arr) {
                boolean result = polindrom(element);
                if (result) {
                    cntPol++;
                }
            }
            if (cntPol == arr.length) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("no");
        }
    }

    static boolean polindrom(int a) {
        int val = a;
        int cnt = 0;
        while (val != 0) {
            cnt++;
            val /= 10;
        }
        int[] arr = new int[cnt];
        int i = 0;
        while (a != 0) {
            int p = a % 10;
            arr[i] = p;
            i++;
            a /= 10;
        }
        int amount = 0;
        for (int j = 0; j < arr.length / 2; j++) {
            if (arr[j] == arr[arr.length - j - 1]) {
                amount++;
            }
        }
        if (amount == (arr.length / 2)) {
            return true;
        } else {
            return false;
        }
    }
}
