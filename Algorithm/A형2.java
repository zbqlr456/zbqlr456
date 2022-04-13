import java.io.*;
import java.util.*;

public class A형2 {
    static int T, W, H, max;
    static int[][] arr;
    static boolean[][] visited;
    static int[] di = {-1, -1, -1, 0, 0, 1};
    static int[] dj = {-1, 0, 1, -1, 1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            max = 0;
            st = new StringTokenizer(br.readLine());
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());
            arr = new int[H][W];
            visited = new boolean[H][W];

            for (int i = 0; i < H; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < W; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            } // Input
            visited[0][0] = true;
            dfs(0, 0, arr[0][0], 0);

            System.out.println("#" + t + " " + max);
        }

    }

    private static void dfs(int i, int j, int users, int cnt) {
        if (cnt == 3) {

            if (max < users * users) {
                max = users * users;
            }
            return;
        }

        for (int d = 0; d < 6; d++) {
            if (i + di[d] < 0 || i + di[d] >= H || j + dj[d] < 0 || j + dj[d] >= W || visited[i + di[d]][j + dj[d]])
                continue;
            visited[i + di[d]][j + dj[d]] = true;
            dfs(i + di[d], j + dj[d], users + arr[i + di[d]][j + dj[d]], cnt + 1);
            visited[i + di[d]][j + dj[d]] = false;
        }

    }

}