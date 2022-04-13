import java.io.*;
import java.util.*;

public class A형 {
    public static void main(String[] args) throws IOException {
        int T, N, M;
        int[][] arr;
        boolean[][] visited;
        int[] di = {0, 0, -1, 1};
        int[] dj = {-1, 1, 0, 0};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            arr = new int[N][M];


            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            } // Input


            for (int n = 1; n <= N; n++) {
                visited = new boolean[N][M];
                Node start = new Node(N - 1, 0);
                Queue<Node> queue = new LinkedList<>();
                queue.add(start);
                int flag = 0;
                while (!queue.isEmpty()) {
                    Node now = queue.poll();
                    Node next = new Node(-1, -1);
                    visited[now.i][now.j] = true;
                    for (int d = 0; d < 4; d++) {
                        if (d == 2) {
                            for (int ni = 0; ni < n; ni++) {
                                next = new Node(now.i + di[d] - ni, now.j + dj[d]);
                                if (next.i < 0 || next.i >= N || next.j < 0 || next.j >= M || visited[next.i][next.j])
                                    continue;
                                if (arr[next.i][next.j] == 1) {
                                    queue.add(new Node(next.i, next.j));
                                    visited[next.i][next.j] = true;
                                }
                                if (arr[next.i][next.j] == 3) {
                                    System.out.println("#" + t + " " + n);
                                    flag = 1;
                                    break;
                                }
                            }
                        } else if (d == 3) {
                            for (int ni = 0; ni < n; ni++) {
                                next = new Node(now.i + di[d] + ni, now.j + dj[d]);
                                if (next.i < 0 || next.i >= N || next.j < 0 || next.j >= M || visited[next.i][next.j])
                                    continue;
                                if (arr[next.i][next.j] == 1) {
                                    queue.add(new Node(next.i, next.j));
                                    visited[next.i][next.j] = true;
                                }
                                if (arr[next.i][next.j] == 3) {
                                    System.out.println("#" + t + " " + n);
                                    flag = 1;
                                    break;
                                }
                            }
                        } else {
                            next = new Node(now.i + di[d], now.j + dj[d]);
                            if (next.i < 0 || next.i >= N || next.j < 0 || next.j >= M || visited[next.i][next.j])
                                continue;
                            if (arr[next.i][next.j] == 1) {
                                queue.add(new Node(next.i, next.j));
                                visited[next.i][next.j] = true;
                            }
                            if (arr[next.i][next.j] == 3) {
                                System.out.println("#" + t + " " + n);
                                flag = 1;
                                break;
                            }
                        }
                        if (flag == 1) break;
                    }
                    if (flag == 1) break;
                }
                if (flag == 1) break;
            }
        }

    }

    static class Node {
        int i, j;

        public Node(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
