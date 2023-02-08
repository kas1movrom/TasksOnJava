package TasksHSE2;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt1 = sc.nextInt();
        int cnt2 = sc.nextInt();
        int[][] arr = new int[cnt1][cnt2];
        int k = 3;
        int amount = 0;
        int j = 0;
        outside : while (true) {
            int cntDel = 0;
            for (int i = 2; i < k; i++) {
                if (k % i == 0) {
                    cntDel++;
                }
            }
            if (cntDel == 0) {
                arr[j][0] = k;
                j++;
            }
            k++;
            if (j == cnt1) {
                break outside;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int h = 1; h < arr[i].length; h++) {
                arr[i][h] = arr[i][h - 1] * arr[i][0];
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
