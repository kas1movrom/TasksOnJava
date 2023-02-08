package TasksUkraine;

import java.util.Scanner;

public class Operations1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            boolean result = Parity(a);
            System.out.println(result);
        } else {
            System.out.println("Error");
        }
    }

    static boolean Parity(int a) {
        if (a < 0) {
            a = Math.abs(a);
        }
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
