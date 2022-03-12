import java.util.*;
import java.io.*;

public class Main_봄버맨_16918 {
    static int R,C,N;
    static char[][] map;
    static char[][] nmap;
    static int[] di = {-1,1,0,0};
    static int[] dj = {0,0,-1,1};
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        nmap = new char[R][C];

        for(int i=0;i<R;i++){
            String tmp = br.readLine();
            for(int j=0;j<C;j++){
                map[i][j] = tmp.charAt(j);
                nmap[i][j] = tmp.charAt(j);
            }
        }

        if (N%2==0){
            for(int i=0;i<R;i++){
                for(int j=0;j<C;j++){
                    System.out.print('O');
                }
                System.out.println();
            }
            System.exit(0);
        }

        for(int t=0;t<N/2;t++){
            for(int i=0;i<map.length;i++){
                System.arraycopy(map[i],0,nmap[i],0,map[i].length);
            }
            for(int i=0;i<R;i++) {
                for (int j = 0; j < C; j++) {
                    if (nmap[i][j] == 'O') {
                        for (int d = 0; d < 4; d++) {
                            if (i + di[d] < 0 || i + di[d] >= R || j + dj[d] < 0 || j + dj[d] >= C)
                                continue;
                            map[i+di[d]][j+dj[d]] = 'O';
                        }
                    }
                }
            }
            for(int i=0;i<R;i++) {
                for (int j = 0; j < C; j++) {
                    if (map[i][j] == 'O') {
                        nmap[i][j] = '.';
                    }else{
                        nmap[i][j] = 'O';
                    }
                }
            }
            for(int i=0;i<map.length;i++){
                System.arraycopy(nmap[i],0,map[i],0,map[i].length);
            }

        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

}
