package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumsOfInteger {
    public static void main(String[] args) throws IOException {
        int i = 0, max = -1000000, min=1000000;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        String s = bf.readLine();

        int[] a = new int[n];

        StringTokenizer st = new StringTokenizer(s);
        for(i = 0; i<a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        if(a.length == 1) {
            min = a[0];
            max = a[0];

        }else {
            for(i=0; i<(n-1); i++) {
                if(a[i]> a[(i+1)]) {
                    if(a[(i+1)]<min) {
                        min = a[(i+1)];
                    }
                    if(a[i]>max) {
                        max = a[i];
                    }
                }
                else {
                    if(a[i] < min) {
                        min= a[i];
                    }
                    if(a[(i+1)]>max) {
                        max = a[(i+1)];
                    }
                }
            }
        }

        System.out.printf("%d %d", min, max);
        bf.close();
    }
}
