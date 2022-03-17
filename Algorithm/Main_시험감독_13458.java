import java.util.*;
import java.io.*;

public class Main_시험감독_13458 {

    public static void main(String[] args) throws IOException {
        // N개의 시험장
        // i번째 시험장 응시자 Ai명
        // 감독관 - 총감독관, 부감독관
        // 총감독관은 B명 감시가능 부감독관은 C명 감시가능
        //

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] A = new int[N]; // 반 갯수 만큼의 크기 배열 생성

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            A[i] = Integer.parseInt(st.nextToken());
        } // 각 반 인원수 배열에 입력

        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken()); // 총감독관 감시 가능 학생 수
        int C = Integer.parseInt(st.nextToken()); // 부감독관 감시 가능 학생 수
        long cnt = N; // 총감독관은 각반에 한명씩 들어가므로 총 수에서 미리 갯수 넣어 둠.
        for(int i=0;i<N;i++){
            A[i] -= B; // 총 감독관 샛으니까 B만큼씩 뺌.
        }

        for(int i=0;i<N;i++){ // 총감독관이 감시하고 남은 학생들의 수에서 C만큼 나누면 부감독관의 필요 수 나옴
            if(A[i] <= 0) continue;
            if(A[i]%C != 0){ // 안나눠 떨어지면 나눈거에서 1명 더해줘야됨
                cnt += A[i]/C + 1;
            }
            else{ // 나눠떨어지면 그냥 나눈만큼 더함
               cnt += A[i]/C;
            }
        }

        System.out.println(cnt);

    }
}
