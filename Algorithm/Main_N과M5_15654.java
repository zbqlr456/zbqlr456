import java.util.*;
import java.io.*;

public class Main_N과M5_15654 {

    static int N,M;
    static int[] arr;
    static int[] result;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        arr = new int[N];
        visited = new boolean[N];
        result = new int[M];

        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        sequence(0);

        System.out.println(sb);

    }

    private static void sequence(int k) {
        if(k==M){
            for(int i=0;i<M;i++){
                sb.append(result[i]+" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0;i<N;i++){
            if(visited[i]) continue;
            visited[i] = true;
            result[k] = arr[i];
            sequence(k+1);
            visited[i] = false;
        }

    }


}
