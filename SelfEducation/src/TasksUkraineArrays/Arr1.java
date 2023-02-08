package TasksUkraineArrays;

public class Arr1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        for (int element : arr1) {
            System.out.println(element + " ");
        }
        arr1 = new int[]{8, 2, 3};
        for (int element : arr1) {
            System.out.println(element + " ");
        }
        print(new int[]{4, 6, 2, 3});
    }

    static void print(int[] array) {
        for (int element : array) {
            System.out.println(element + " ");
        }
    }
}
