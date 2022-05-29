import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_나는친구가적다Small_16171 {
    public static void main(String[] args) throws IOException {
        // 알파벳 소문자, 대문자, 숫자로 이루어진 문자열 S
        // 찾고자하는 알파벳 소문자, 대문자로만 이루어진 키워드 문자열 K
        // 정규표현식으로 숫자를 제외한 문자열 찾음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        Pattern pattern = Pattern.compile("^[a-zA-Z]*$");
        Matcher matcher = pattern.matcher(str1);

    }
}
