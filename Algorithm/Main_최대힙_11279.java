import java.util.*;
import java.io.*;

public class Main_최대힙_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());

        int N = Integer.parseInt(br.readLine());
        // 자연수를 입력 받으면 배열에 그 수 추가
        // 0을 입력 받으면 배열에서 가장 큰 값을 출력하고 제거
        // 비어 있는데 0 입력 받으면

        for(int i=0;i<N;i++){
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                if(!queue.isEmpty()){
                    System.out.println(queue.poll());
                }else{
                    System.out.println(0);
                }
            }else{
                queue.offer(input);
            }

        }


    }
}
