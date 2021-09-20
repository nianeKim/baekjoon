package baekjoon;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //첫째 줄에 두 정수 H와 M이 주어진다.
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if(m >= 45) {
            m -= 45;
            System.out.printf("%d %d", h, m);
        }
        else {
            if(h == 0) {
                h = 23;
            }else {
                h -= 1;
            }
            m += 15;
            System.out.printf("%d %d", h, m);
        }
        scanner.close();
    }
}
