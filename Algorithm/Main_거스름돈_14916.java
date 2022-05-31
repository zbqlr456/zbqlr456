import java.util.*;
import java.io.*;

public class Main_거스름돈_14916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int two = 0, five = 0;

        if (n % 5 == 1 || n % 5 == 3) {
            five = n / 5 - 1;
        } else {
            five = n / 5;
        }
        two = (n - 5 * (five)) / 2;


        System.out.println(five < 0 ? -1:two + five);

    }
}
