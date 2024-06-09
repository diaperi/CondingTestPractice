package Day2;

import java.util.Scanner;

public class BOJ1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextInt();
        double B = sc.nextInt();
        System.out.println(A/B);
        // float double => 정밀도
        // float => 소수점 6~7자리 정도
        // double => 소수점 15~16자리 정도까지 표현이 가능

        // TODO 코테에서는 웬만하면 float 보다는 double 쓰는게 더 좋음.1
    }
}
