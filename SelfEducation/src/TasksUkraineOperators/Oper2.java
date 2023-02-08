package TasksUkraineOperators;

import java.util.Scanner;

public class Oper2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int day = sc.nextInt();
            switch(day) {
                case 1:
                    System.out.println("Ponedelnik");
                    break;
                case 2:
                    System.out.println("Vtornik");
                    break;
                case 3:
                    System.out.println("Sreda");
                    break;
                case 4:
                    System.out.println("Chetverg");
                    break;
                case 5:
                    System.out.println("Pyatnica");
                    break;
                case 6:
                    System.out.println("Subbota");
                    break;
                case 7:
                    System.out.println("Voskresenie");
                    break;
                default:
                    System.out.println("Net takogo");
            }
        } else {
            System.out.println("Error");
        }
    }
}
