import java.util.*;
import java.io.*;

public class Main_N과M1_15649 {
    static int N,M;
    static int[] arr;
    static int[] result;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N];
        arr = new int[N];
        result = new int[M];

        for(int i=0;i<N;i++){
            arr[i] = i+1;
        }

        subset(0);
    }
    public static void subset(int k){
        if(k==M){
            for(int i=0;i<M;i++){
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i=0;i<N;i++){
            if(visited[i])
                continue;
            result[k] = arr[i];
            visited[i] = true;
            subset(k+1);
            visited[i] = false;
        }
    }
}
