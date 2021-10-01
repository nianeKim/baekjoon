package baekjoon;

import java.util.Scanner;

public class Sangsu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        a = (a%10)*100 + (a/10%10)*10 + (a/100%10);
        b = (b%10)*100 + (b/10%10)*10 + (b/100%10);

        System.out.println((a>b) ? a : b);
        sc.close();
    }
}
