package baekjoon;

import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max=0;
        float sum = 0;
        int[] arr = new int[n];

        for(int i = 0; i<arr.length;i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            if(arr[i]>max) max = arr[i];
        }
        System.out.println(sum/max*100/n);
        sc.close();
    }
}
