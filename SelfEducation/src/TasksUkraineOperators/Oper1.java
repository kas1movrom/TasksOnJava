package TasksUkraineOperators;

import java.util.Scanner;

public class Oper1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (a % 2 != 0) {
                System.out.println(a);
            }
        } else {
            System.out.println("Error");
        }
    }
}
