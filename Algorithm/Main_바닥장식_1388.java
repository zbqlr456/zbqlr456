import java.util.*;
import java.io.*;

public class Main_바닥장식_1388 {
    static char[][] map;
    static boolean[][] visited;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        map = new char[N][M];
        visited = new boolean[N][M];
        cnt = 0;

        for(int i=0;i<N;i++){
            String tmp = br.readLine();
            map[i] = tmp.toCharArray();
        }

    }
}
