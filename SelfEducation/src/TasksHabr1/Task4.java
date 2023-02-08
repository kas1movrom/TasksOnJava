package TasksHabr1;

import java.util.Arrays;

public class Task4 {
    public static int[] deleteElement1(int[] arr, int value) {
        int cnt = 0;
        if (arr[arr.length - 1] == value) {
            cnt++;
        }
        for (int i = 0; i < arr.length - cnt; i++) {
            if (arr[i] == value) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                cnt++;
                i--;
            }
        }
        return Arrays.copyOf(arr, arr.length - cnt);
    }

    public static int[] deleteElement2(int[] arr, int value) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                cnt++;
            } else {
                arr[i - cnt] = arr[i];
            }
        }
        return Arrays.copyOf(arr, arr.length - cnt);
    }
}
