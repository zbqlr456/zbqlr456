import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main_수학숙제_2870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] str;
        ArrayList<BigInteger> list = new ArrayList<>();


        for(int i=0;i<N;i++){
            str = br.readLine().split("\\D");
            for(int j=0;j<str.length;j++){
                if(!str[j].equals(""))
                    list.add(new BigInteger(str[j]));
            }
        }
        Collections.sort(list);

        for(BigInteger l : list){
            System.out.println(l);
        }



    }

}

