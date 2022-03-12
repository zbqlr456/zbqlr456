import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main_수학숙제_2870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] str = new String[N];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i =0; i<N;i++){
            str[i] = br.readLine();
        }

        for(int i =0; i<N;i++){
            for(int j=0;j<str[i].length();j++){
                char[] ch = new char[str.length];
                ch[j] = str[i].charAt(j);
                for(int k=0;k<ch.length;k++){
                    if(ch[j] >= '0' && ch[j] <='9'){
                        list.add(ch[j] - '0');
                    }
                }
            }
        }
        Collections.sort(list);
        for(int i=0;i<list.toArray().length;i++){
            list.indexOf(i);
        }

    }

}

