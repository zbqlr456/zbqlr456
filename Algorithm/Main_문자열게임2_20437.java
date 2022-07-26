import java.util.*;
import java.io.*;

public class Main_문자열게임2_20437 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            char[] w = br.readLine().toCharArray();
            int k = Integer.parseInt(br.readLine());

            if(k == 1){
                System.out.println("1 1");
                continue;
            }

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < w.length; i++) {
                int cnt = 1;
                int len = 1;
                for (int j = i + 1; j < w.length; j++) {
                    if (w[j] == w[i])
                        cnt++;
                    len++;
                    if (cnt == k) {
                        if (min > len)
                            min = len;
                        if (w[i] == w[j]) {
                            if (max < len)
                                max = len;
                        }
                        break;
                    }
                }
            }
            if (min == Integer.MAX_VALUE)
                System.out.println(-1);
            else
                System.out.println(min + " " + max);

        }

    }
}
