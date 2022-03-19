import java.util.*;
import java.io.*;

public class Main_수찾기_1920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int result = 0;
            int a = Integer.parseInt(st.nextToken());
            int start = 0;
            int end = N-1;
            int mid = (end + start)/2;
            if(a <= A[end] && a >= A[start]) {
                while (start <= end) {
                    mid = (end + start) / 2;
                    if (a == A[mid]) {
                        result = 1;
                        break;
                    }
                    if (a > A[mid]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }

                }
            }
            System.out.println(result);
        }

    }
}
