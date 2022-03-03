import java.io.BufferedWriter;
import java.util.*;
import java.io.*;
public class Main_N과M3_15651 {

    static int N,M;
    static int[] result;
//    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        result = new int[M+1];

        sequence(1);

//        bw.close();
        System.out.println(sb);
    }

    private static void sequence(int k) throws IOException {

        if(k>=M+1){
            for(int i=1;i<M+1;i++){
//                bw.write(String.valueOf(result[i])+" ");
                sb.append(result[i] + " ");
            }
//            bw.write("\n");
//            bw.flush();
            sb.append("\n");
            return;
        }
        for(int i=1;i<N+1;i++){
            result[k] = i;
            sequence(k+1);
        }
    }
}
