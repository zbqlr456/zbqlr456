import java.util.*;
import java.io.*;

public class Main_맥주마시면서걸어가기_9205 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            int N = Integer.parseInt(br.readLine());
            boolean[] visited = new boolean[N+2];
            Node[] node = new Node[N+2];
            for(int i=0;i<N+2;i++){
                st = new StringTokenizer(br.readLine());
                node[i] = new Node(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
            }
            // input
            // node[0] = home, node[N+1] = festival

            Queue<Node> queue = new LinkedList<Node>();
            queue.add(node[0]);
            visited[0] = true;

            boolean result = false;
            while(!queue.isEmpty()){
                Node n = queue.poll();
                if(Math.abs(node[N+1].x - n.x) + Math.abs(node[N+1].y - n.y) <= 1000){
                    result = true;
                    break;
                }

                for(int i=0;i<N+1;i++){
                    if(visited[i]) continue;
                    if(Math.abs(node[i].x - n.x) + Math.abs(node[i].y - n.y) <= 1000){
                        queue.add(node[i]);
                        visited[i] = true;
                    }
                }

            }
            if(result)
                System.out.println("happy");
            else
                System.out.println("sad");

        }

    }
    public static class Node{
        int x,y;
        Node(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
}
