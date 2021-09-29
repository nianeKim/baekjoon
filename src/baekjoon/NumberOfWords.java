package baekjoon;

import java.util.Scanner;

public class NumberOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] st = new String[1000000];
        st = str.split(" ");
        if(st.length>0) {
            if(st[0].equals("")) {
                System.out.println(st.length-1);
            }
            else {
                System.out.println(st.length);
            }
        }
        else {
            System.out.println(0);
        }
        sc.close();
    }
}
