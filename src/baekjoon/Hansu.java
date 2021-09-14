package baekjoon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Hansu {
    private static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;

        for(int i=1;n>0;i++){
            System.out.println(n%10);
            n/=10;
            System.out.println(n);
        }

        System.out.println(n/100%10);
        System.out.println(n/10%10);
        System.out.println(n%10);

    }
}
