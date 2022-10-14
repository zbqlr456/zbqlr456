import java.util.*;
public class test {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[2] = 1;
        String str = Integer.toString(a[2]);
        System.out.println(str);
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"바나나");
        System.out.println(hm.get(1));
        str = hm.get(1);
        System.out.println(str);
        System.out.println(hm.containsKey(2));
        String s = String.valueOf(424234);
        System.out.println(s);
        int k = Integer.parseInt(s);
        System.out.println(k);
    }
}
