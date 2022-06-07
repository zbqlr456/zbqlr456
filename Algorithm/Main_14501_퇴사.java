import java.io.*;
import java.util.*;

public class Main_14501_퇴사 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());

        int[] t = new int[N+10];
        int[] p = new int[N+10];
        int[] dp = new int[N+10];
        int max = 0;

        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1;i<=N+1;i++){
            dp[i] = Math.max(dp[i],max);
            dp[i+t[i]] = Math.max(dp[t[i]+i],p[i]+dp[i]);
            max = Math.max(max,dp[i]);

        }
        System.out.println(max);

    }
}
