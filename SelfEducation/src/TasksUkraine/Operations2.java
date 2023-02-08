package TasksUkraine;

import java.util.Scanner;

public class Operations2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        a = a < 0 ? (-1) * a : a;
        b = b < 0 ? (-1) * b : b;
        c = c < 0 ? (-1) * c : c;
        System.out.println(Sum(a, b, c));
    }

    static int Sum(int a, int b, int c) {
        return a + b + c;
    }
}
