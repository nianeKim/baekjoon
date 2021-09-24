package baekjoon;

import java.util.Scanner;

public class SumsOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 1000000;
        int max = 0;
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();

            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }

        System.out.printf("%d %d", min, max);
        sc.close();
    }
}
