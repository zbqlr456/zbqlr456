import java.util.*;
import java.io.*;

public class Main_행성연결_16398 {
    static int[] parents;
    static int minCost = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N+1][N+1];

        for(int i=1;i<N+1;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j< N+1;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        } // input

        parents = makeSet(N);



    }

    private static int[] makeSet(int size) {
        int[] arr = new int[size+1];
        for(int i=1;i<arr.length;i++){
            arr[i] = i;
        }
        return arr;
    }

    private static int find(int a){
        if(parents[a] == a){
            return a;
        }
        else{
            return parents[a] = find(parents[a]);
        }
    }

    private static void union(int a, int b){
        int aRoot = find(a);
        int bRoot = find(b);

        if(aRoot != bRoot){
            parents[bRoot] = aRoot;
        }
    }
}
