package OtherTasksArr;

import TasksHSE3.Task2;
import TasksHabr1.Task4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 4, 3, 3, 3 , 8, 3, 8};
        int[] arr2 = {0, 1, 0, 0, 1, 0, 3};
        int[] arr3 = {1, -2, 0, 5, -1, -4};
        //System.out.println(Arrays.toString(Task4.deleteElement1(arr1, 3)));
        //triple(arr3, 2);
        //captain(arr3);
        //removeLR(arr2);
        //System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(partition(arr1)));
    }

    static int[][] findTwo(int[] arr, int value) {
        int cnt = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == value) {
                    cnt++;
                }
            }
        }
        int[][] indexes = new int[cnt][2];
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == value) {
                    indexes[k][0] = arr[i];
                    indexes[k][1] = arr[j];
                    k++;
                }
            }
        }
        return indexes;
    }

    static void leftBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    static void removeNull(int[] arr, int value) {
        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == value) {
                    for (int j = i; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    arr[arr.length - 1] = value;
                }
            }
        }
    }

    static int[] removeDuplicate(int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length - 1 - cnt; i++) {
            for (int j = i + 1; j < arr.length - cnt; j++) {
                if (arr[j] == arr[i]) {
                    cnt++;
                    for (int k = j; k < arr.length - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    j--;
                }
            }
        }
        int[] arr1 = Arrays.copyOf(arr, arr.length - cnt);
        return arr1;
    }

    static void triple(int[] arr, int value) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == value) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
    }

    static void captain(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int cnt = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    cnt++;
                }
            }
            if (cnt == arr.length - i - 1) {
                System.out.println(arr[i]);
            }
        }
    }

    static void findBetweenNull(int[] arr) {
        int sum = Math.abs(arr[0] + arr[1]);
        int target1 = arr[0];
        int target2 = arr[1];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] + arr[j]) < sum) {
                    sum = Math.abs(arr[i] + arr[j]);
                    target2 = arr[j];
                    target1 = arr[i];
                }
            }
        }
        System.out.println(target1 + " " + target2);
    }

    static void removeLR(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == 0) {
                    for (int j = i; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    arr[arr.length - 1] = 0;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i] == 1) {
                    for (int j = i; j > 0; j--) {
                        arr[j] = arr[j - 1];
                    }
                    arr[0] = 1;
                }
            }
        }
    }

    static int[] partition(int[] arr) {
        Arrays.sort(arr);
        int[] arrMin = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] arrMax = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
        leftBubbleSort(arrMax);
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                res[i] = arrMax[i / 2];
            } else {
                res[i] = arrMin[i / 2];
            }
        }
        return res;
    }
}
