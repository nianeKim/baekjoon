package baekjoon;
import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int r=0;
        String s = "";
        for(int i=1; i<=t; i++) {
            r = sc.nextInt();
            s = sc.next();

            String[] st = new String[20];
            st = s.split("");
            for(int j=0; j<st.length; j++) {
                for(int k=0;k<r;k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}
