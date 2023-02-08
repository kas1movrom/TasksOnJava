package TasksHabr1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int cnt = sc.nextInt();
            double[] arr = new double[cnt];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Math.random();
            }
            double maxValue = arr[0];
            double minValue = arr[0];
            double betweenVal = 0;
            for (double element : arr) {
                if (element > maxValue) {
                    maxValue = element;
                }
                if (element < minValue) {
                    minValue = element;
                }
                betweenVal += element;
            }
            betweenVal /= arr.length;
            System.out.println(maxValue + " " + minValue + " " + betweenVal);
        }
    }
}
