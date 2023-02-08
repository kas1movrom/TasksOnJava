package TasksUkraine;

import java.util.Scanner;

public class Vocabulary1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt() && sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(Sum(a, b));
        } else {
            System.out.println("Error");
        }
    }

    static int Sum(int a, int b) {
        return a + b;
    }

    static int Diff(int a, int b) {
        return a - b;
    }

    static int Multiplication(int a, int b) {
        return a * b;
    }

    static int Division(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            return 0;
        }
    }
}
