import java.util.*;
import java.io.*;

public class Main_N과M4_15652 {

    static int N,M;
    static int[] result;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        result = new int[M+1];
        visited = new boolean[N+1];
        sequence(1,1);

        System.out.println(sb);

    }

    private static void sequence(int k, int cnt) {
        if(k==M+1){
            for(int i=1;i<M+1;i++){
                sb.append(result[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i=cnt;i<N+1;i++){
            result[k] = i;
            sequence(k+1,i);
        }
    }
}
