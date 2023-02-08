package TasksUkraineOperators;

import java.util.Scanner;

public class Oper3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int factorial = 1;
            for (int i = 1; i <= a; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        } else {
            System.out.println("Error");
        }
    }
}
