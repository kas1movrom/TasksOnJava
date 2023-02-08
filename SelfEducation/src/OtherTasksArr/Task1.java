package OtherTasksArr;

import TasksHSE3.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[0];
        int i = 0;
        int value = 1;
        while (value != 0) {
            value = sc.nextInt();
            arr = addEl(arr, i, value);
            i++;
        }
        arr = delEl(arr, arr.length - 1);
        arr = sliceArr(arr, 1, 6);
        Task2.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] delEl(int[] arr, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        int[] numbers = Arrays.copyOf(arr, arr.length - 1);
        return numbers;
    }

    static int[] addEl(int[] arr, int index, int value) {
        int[] numbers = Arrays.copyOf(arr, arr.length + 1);
        for (int i = numbers.length - 1; i > index; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[index] = value;
        return numbers;
    }

    static boolean isSorted(int[] arr) {
        int[] numbers = Arrays.copyOf(arr, arr.length);
        Arrays.sort(numbers);
        return Arrays.equals(arr, numbers);
    }

    static int[] sliceArr(int[] arr, int n, int m) {
        int[] numbers = Arrays.copyOfRange(arr, n, m + 1);
        return numbers;
    }

    int numberSwap(int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    cnt++;
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return cnt;
    }

    static void modSelectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    pos = j;
                }
            }
            if (pos != i) {
                arr[pos] = arr[i];
                arr[i] = min;
            }
        }
    }


}
