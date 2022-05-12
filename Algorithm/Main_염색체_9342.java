import java.io.*;
import java.util.*;

public class Main_염색체_9342 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        // 정규표현식

        for(int i=0;i<T;i++){
            String str = br.readLine();
            String regExp = "[A-F]?A+F+C+[A-F]?";
            String answer = str.matches(regExp) ? "Infected!" : "Good";

            System.out.println(answer);
        }



    }
}
