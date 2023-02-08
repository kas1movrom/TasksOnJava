package TasksHSE1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int k = sc.nextInt();
            int[] arr = new int[50];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int)Math.pow((i + 1), 2);
            }
            int cnt = 0;
            int target = 0;
            outside : for (int element : arr) {
                int n = 0;
                int value = element;
                while (value != 0) {
                    n++;
                    value /= 10;
                }
                cnt += n;
                if (cnt >= k) {
                    target = element;
                    break outside;
                }
            }
            if (cnt == k) {
                System.out.println(target % 10);
            } else {
                int push = cnt - k + 1;
                int n = 0;
                int result = 0;
                outside : while (target != 0) {
                    int p = target % 10;
                    target /= 10;
                    n++;
                    if (n == push) {
                        result = p;
                        break outside;
                    }
                }
                System.out.println(result);
            }
        } else {
            System.out.println("Error");
        }
    }
}
