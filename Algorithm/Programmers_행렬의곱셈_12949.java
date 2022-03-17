import java.io.*;
import java.util.*;

public class Programmers_행렬의곱셈_12949 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        System.out.println(Arrays.deepToString(solution(arr1, arr2)));
        arr1 = new int[][]{{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        arr2 = new int[][]{{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
        System.out.println(Arrays.deepToString(solution(arr1, arr2)));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i=0;i<answer.length;i++){
            for(int j=0;j<answer[i].length;j++) {
                for (int x = 0; x < arr1[0].length; x++) {
                    answer[i][j] += arr1[i][x] * arr2[x][j];
                }
            }
        }

        return answer;
    }
}
