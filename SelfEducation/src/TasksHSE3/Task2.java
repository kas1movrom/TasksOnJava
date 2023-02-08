package TasksHSE3;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[]arr = new int[cnt];
        readArr(arr);
        reversArr(arr);
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reversArr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }

    static void shift1(int[] arr, int cnt) {
        if (cnt % arr.length != 0) {
            int[] numbers = Arrays.copyOf(arr, arr.length);
            if (cnt > 0) {
                cnt = cnt % arr.length;
            } else {
                cnt = arr.length - (Math.abs(cnt) % arr.length);
            }
            int index = arr.length - cnt;
            System.arraycopy(numbers, index, arr, 0, cnt);
            System.arraycopy(numbers, 0, arr, cnt, index);
        }
    }

    static void readArr(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    static int[] mergeArr(int[] arr1, int[] arr2) {
        int[] numbers = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, numbers, 0, arr1.length);
        System.arraycopy(arr2, 0, numbers, arr1.length, arr2.length);
        return numbers;
    }

    int checkEl(int[] arr, int value) {
        boolean result = false;
        int index = 0;
        outside : for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                result = true;
                index = i;
                break outside;
            }
        }
        if (result) {
            return index;
        } else {
            return -1;
        }
    }
}
