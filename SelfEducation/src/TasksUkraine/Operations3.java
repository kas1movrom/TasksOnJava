package TasksUkraine;

import java.util.Arrays;
import java.util.Scanner;

public class Operations3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (a < 0) {
                a = Math.abs(a);
            }
            if (sc.hasNextInt()) {
                int cnt = sc.nextInt();
                if (cnt < 0) {
                    cnt = Math.abs(cnt);
                }
                boolean flag = false;
                IntToBinary(a, flag);
                a = Blink(a);
                IntToBinary(a, flag);
                System.out.println(IsFirstLampOn(a));
                a = run(a, cnt, flag);
                IntToBinary(a, flag);
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("Error");
        }
    }

    static void IntToBinary(int a, boolean flag) {
        if (flag) {
            int val = a;
            int cnt = 0;
            while (val != 0) {
                val /= 2;
                cnt++;
            }
            int[] arr = new int[cnt];
            int j = 0;
            while (a != 0) {
                int ost = a % 2;
                a /= 2;
                arr[j] = ost;
                j++;
            }
            for (int i = 0; i < arr.length / 2; i++) {
                arr[i] = arr[arr.length - i - 1];
            }
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println(Integer.toBinaryString(a));
        }
    }

    static int Blink(int a) {
        return ~a;
    }

    static boolean IsFirstLampOn(int a) {
        if ((a & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }

    static int run(int a, int cnt, boolean flag) {
        if (flag) {
            return a >> cnt;
        } else {
            return a << cnt;
        }
    }
}
