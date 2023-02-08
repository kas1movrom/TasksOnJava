package TasksHSE3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt1 = sc.nextInt();
        int cnt2 = sc.nextInt();
        int[][] arr = new int[cnt1][cnt2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] arrSum = new int[cnt1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrSum[i] += arr[i][j];
            }
        }
        int[] arrMax = new int[cnt1];
        for (int i = 0; i < arrMax.length; i++) {
            arrMax[i] = arr[i][0];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > arrMax[i]) {
                    arrMax[i] = arr[i][j];
                }
            }
        }
        int MaxValue = arrMax[0];
        int n = 0;
        for (int element : arrMax) {
            if (element > MaxValue) {
                MaxValue = element;
            }
        }
        for (int element : arrMax) {
            if (element == MaxValue) {
                n++;
            }
        }
        if (n == 1) {
            outside : for (int i = 0; i < arrMax.length; i++) {
                if (arrMax[i] == MaxValue) {
                    System.out.println(i);
                    break outside;
                }
            }
        } else {
            int maxSum = 0;
            for (int i = 0; i < arrMax.length; i++) {
                if (arrMax[i] == MaxValue) {
                    if (arrSum[i] > maxSum) {
                        maxSum = arrSum[i];
                    }
                }
            }
            int nSum = 0;
            for (int i = 0; i < arrMax.length; i++) {
                if (arrSum[i] == maxSum) {
                    nSum++;
                }
            }
            if (nSum == 1) {
                outside : for (int i = 0; i < arrSum.length; i++) {
                    if (arrSum[i] == maxSum) {
                        System.out.println(i);
                        break outside;
                    }
                }
            } else {
                System.out.println(0);
            }
        }
    }
}
