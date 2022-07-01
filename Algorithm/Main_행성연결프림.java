import java.util.*;
import java.io.*;

public class Main_행성연결프림 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());

        int[][] map = new int[N][N];
        boolean[] visited = new boolean[N];
        int[] minV = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
            minV[i] = Integer.MAX_VALUE;
        }

        minV[0] = 0;
        long result = 0;

        for (int i = 0; i < N; i++) {
            // 1. 신장트리에 포함되지 않은 정점 중 최소간선비용의 정점 찾기.
            int min = Integer.MAX_VALUE;
            int minEdge = -1; // 최소간선비용의 정점 번호
            for (int j = 0; j < N; j++) {
                if (!visited[j] && min > minV[j]) {
                    min = minV[j];
                    minEdge = j;

                }
            }
            result += min; // 간선비용 누적
            visited[minEdge] = true; // 신장트리에 포함 시킴

            // 2. 선택된 정점 기준으로 신장트리에 연결되지 않은 타 정점과의 간선 비용 최소로 업데이트
            for (int j = 0; j < N; j++) {
                if (!visited[j] && minV[j] > map[minEdge][j]) { // 모두 비용을 갖고 있기 때문에 map[minEdge][j] != 0은 사실 필요 없음.
                    minV[j] = map[minEdge][j];
                }
            }
        }

        System.out.println(result);

    }
}
