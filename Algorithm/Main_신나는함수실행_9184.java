import java.util.*;
import java.io.*;

public class Main_신나는함수실행_9184 {

    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == -1 && b == -1 && c == -1) break;

            System.out.println("w(" + a + ", " + b + ", " + c + ") = " + w(a, b, c));

        }
    }

    private static int w(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0)
            return 1;
        if (a > 20 || b > 20 || c > 20)
            return w(20, 20, 20);
        if (a < b && b < c){
            return w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        }
        for(int i=1;i<=20;i++){
            if(a == i) return (int)Math.pow(2,i);
        }
        return w(a-1,b,c) + w(a-1,b,c) + w(a-1,b,c-1) - w(a-1,b-1,c-1);

    }

}
