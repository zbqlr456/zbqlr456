import java.util.*;
import java.io.*;

public class Main_우주신과의교감프림_1774 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        double minV[] = new double[N];
        Arrays.fill(minV,Double.MAX_VALUE);

        double[][] map = new double[N][N];
        boolean[] visited = new boolean[N];
        double result = 0.0;

        int[][] edges = new int[M][2]; /// 연결된 간선정보 받아오는 배열
        Point[] points = new Point[N]; // 좌표 정보 받아오는 배열

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            points[i] = new Point(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            edges[i][0] = Integer.parseInt(st.nextToken())-1;
            edges[i][1] = Integer.parseInt(st.nextToken())-1;
            if(!visited[edges[i][0]])
                visited[edges[i][0]] = true; // 이미 연결된 노드들은 true 처리
            if(!visited[edges[i][1]])
                visited[edges[i][1]] = true;
        } // input


        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                map[i][j] = Math.sqrt(Math.pow(points[i].x - points[j].x,2) + Math.pow(points[i].y - points[j].y,2));
            }
        } // 배열에 전체 노드와 간선 정보 입력

//        for(int i=0;i<N;i++){
//            for(int j=0;j<N;j++){
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }
        int start = 0;
        for(int i=0;i<N-M-1;i++){
            int minNode = Integer.MAX_VALUE;
            double min = Double.MAX_VALUE;
            visited[start] = true;
            for(int j=0;j<N;j++){
                if(!visited[j]){
                    minV[j] = Math.min(minV[j],map[start][j]);
                    if(min>minV[j]){
                        min = minV[j];
                        minNode = j;
                    }
                }
            }
            result += min;
            start = minNode;
        }
        System.out.println(String.format("%.2f", result));
    }
    public static class Point{
        int x,y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

}
