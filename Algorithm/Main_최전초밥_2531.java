import java.util.*;
import java.io.*;

public class Main_최전초밥_2531 {

    static int N,d,k,c,max=0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 8
        d = Integer.parseInt(st.nextToken()); // 30
        k = Integer.parseInt(st.nextToken()); // 4
        c = Integer.parseInt(st.nextToken()); // 30

        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0;i<N;i++){
            int cnt=0,idx=0;
            int[] eat = new int[d+1];
            boolean check = false;
            for(int j=i;j<k+i;j++){
                idx = j;
                if(idx>=N) idx-=N;
                if(arr[idx] == c)
                    check = true;
                eat[arr[idx]]++;
            }
            for(int j=1;j<d+1;j++){
                if(eat[j]!=0)
                    cnt++;
            }
            if(max<=cnt){
                if(check){
                    max = cnt;
                }
                else{
                    max = cnt+1;
                }
            }
        }

        System.out.println(max);

    }

}
