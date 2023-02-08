package TasksHSE1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxVal = arr[0];
        int minVal = arr[0];
        for (int element : arr) {
            if (element > maxVal) {
                maxVal = element;
            }
            if (element < minVal) {
                minVal = element;
            }
        }
        outside: for (int element : arr) {
            if (element == maxVal) {
                System.out.println("max");
                break outside;
            }
            if (element == minVal) {
                System.out.println("min");
                break outside;
            }
        }
    }
}
