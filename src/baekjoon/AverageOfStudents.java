package baekjoon;
import java.util.Scanner;

public class AverageOfStudents {
    public static void main(String[] args) {
        int sum = 0, avg = 0;
        float per = 0;
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        for(int i=1; i<=c; i++) {
            int n=sc.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
                avg = sum/n;
            }
            for(int a:arr) {
                if(a>avg) {
                    per++;
                }
            }
            System.out.printf("%.3f%%\n", per/arr.length*100);
            sum=0;
            avg=0;
            per=0;
        }
        sc.close();
    }
}
