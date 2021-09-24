package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SumsOfInteger {
    public static void main(String[] args) throws IOException {
        int i = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        String s = bf.readLine();

        int[] a = new int[n];

        StringTokenizer st = new StringTokenizer(s);
        for(i = 0; i<a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);

        System.out.printf("%d %d", a[0], a[(n-1)]);
        bf.close();
    }
}
