package baekjoon;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String num = sc.next();
        String[] arr = num.split("");

        int sum = 0;
        for(int i=0; i<n ; i++) {
            sum += Integer.parseInt(arr[i]);
        }

        System.out.println(sum);
        sc.close();
    }
}
