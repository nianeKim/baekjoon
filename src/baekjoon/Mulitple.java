package baekjoon;

import java.util.Scanner;

public class Mulitple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,c,d,e = 0;
        a = scanner.nextInt();
        b = scanner.nextInt();

        c = b%10;
        d = (b/10)%10;
        e = b/100;

        System.out.println(a*c);
        System.out.println(a*d);
        System.out.println(a*e);
        System.out.println(a*b);

    }
}
