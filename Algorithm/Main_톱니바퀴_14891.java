import java.util.*;
import java.io.*;
public class Main_톱니바퀴_14891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int[] one = new int[8];
        int[] two = new int[8];
        int[] three = new int[8];
        int[] four = new int[8];

        String inputNS = br.readLine();

        for(int i=0;i<8;i++){
            one[i] = inputNS.charAt(i)-'0';
        }
        for(int i=0;i<8;i++){
            two[i] = inputNS.charAt(i)-'0';
        }
        for(int i=0;i<8;i++){
            three[i] = inputNS.charAt(i)-'0';
        }
        for(int i=0;i<8;i++){
            four[i] = inputNS.charAt(i)-'0';
        }

        int sum = 0;
        int K = Integer.parseInt(br.readLine());
        for(int k=0;k<K;k++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int dir = Integer.parseInt(st.nextToken());
            if(num == 1){

            }
            else if(num == 2){

            }
            else if(num == 3){

            }
            else if(num == 4){

            }

        }

        if(one[0] == 1)
            sum+=1;
        if(two[0] == 1)
            sum+=2;
        if(three[0] == 1)
            sum+=4;
        if(four[0] == 1)
            sum+=8;

        System.out.println(sum);

    }
}
