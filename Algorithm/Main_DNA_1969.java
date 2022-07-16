import java.util.*;
import java.io.*;

public class Main_DNA_1969 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] DNA = new char[N][M];
        int[][] hd = new int[N][N];

        for(int i=0;i<N;i++){
            String tmp = br.readLine();
            DNA[i] = tmp.toCharArray();
        }

        int cnt = 0;
        for(int n=0;n<N;n++){
            for(int i=n+1;i<N;i++){
                for(int j=0;j<M;j++){

                }
            }
        }

    }
}
