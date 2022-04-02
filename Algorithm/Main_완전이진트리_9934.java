import java.util.*;
import java.io.*;

public class Main_완전이진트리_9934 {
    static int depth;
    static int[] arr;
    static ArrayList<Integer>[] tree;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        depth = Integer.parseInt(br.readLine());
        arr = new int[(int) Math.pow(2,depth)];
        tree = new ArrayList[depth+1];

        for(int i=0;i<=depth;i++){
            tree[i] = new ArrayList<Integer>();
        }

        st = new StringTokenizer(br.readLine());
        for(int i=1;i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        inorder(1,1,arr.length-1);
        for(int i=1;i<=depth;i++){
            for(int j:tree[i]){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void inorder(int d, int start, int end) {

        tree[d].add(arr[(start+end)/2]);
        if(d == depth)
            return;

        inorder(d+1,start,(end+start)/2-1);
        inorder(d+1,(end+start)/2+1,end);

    }

}
