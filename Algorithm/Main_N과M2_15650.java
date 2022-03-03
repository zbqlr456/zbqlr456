import java.io.*;
import java.util.*;

public class Main_N과M2_15650 {
    static int N,M;
    static int[] result;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        result = new int[M];
        visited = new boolean[N];

        for(int i=0;i<N;i++){
            arr[i] = i+1;
        }

        sequence(0);
    }

    private static void sequence(int k) {
        if(k==M){
            for(int i=0;i<M-1;i++){
                if(result[i+1]<=result[i])
                    return;
            }
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
            sequence(k+1);
            visited[i] = false;
        }
    }


}
