package Day11;

import java.util.Scanner;

public class BOJ10872 {
    public static void main(String[] args) {
        // 10! -> 1~10까지 곱한 것
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N < 2) {    // 0!, 1! -> 무조건 1
            System.out.println(1);
        } else {
            int fac = 1;
            for (int i = 2; i <= N; i++) {
                fac = fac * i;
            }
            System.out.println(fac);
        }
    }
}
