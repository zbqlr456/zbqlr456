import java.util.Scanner;

public class Main_CattleDefense_17135 {

    static int n = 5,r = 3,cc=0;
    static int M,N,D;
    static int killpoint=0;
    static int maxKill = Integer.MIN_VALUE;
    static int[][] map;
    static boolean[] archer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        D = sc.nextInt();

        map = new int[N][M];
        archer = new boolean[M];

        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                map[i][j] = sc.nextInt();
            }
        }//입력완료

        comb(0,0);//조합
        System.out.println(killpoint);

    }
    static void kill() {//에너미 킬. 포문 돌면서 1이면 아처 위치랑 비교해서 제일 가까운놈 죽임.대신 사정거리 안이어야함.죽일때마다 cnt++
        for(int k=0; k<5;k++) {
            int tmp =0,x=0,y=0,hit=0,dis=Integer.MAX_VALUE;
            if(archer[k]) {//k가 true면 (궁수가 있으면) 그 위치에서
                for(int i=0;i<N;i++) {//맵을 훑어서 가장 가까운 적을 찾음
                    for(int j=0;j<M;j++) {
                        if(map[i][j]==1) {
                            tmp = Math.abs(5-i)+Math.abs(k-j);
                            if(tmp>D)	continue;
                            if(tmp<dis) {
                                dis = tmp;
                                x = i;
                                y = j;
                                hit++;//적중하면 적중했다고 표시
                            }//1의 위치정보 저장.
                        }
                    }
                }
                if(hit==0)	continue;//적중 못했으면 continue;
                map[x][y] = 0;//가장 가까운놈 0으로 바꿈
                killpoint++;
            }
        }
    }
    static void comb(int target,int cnt) {
        if(cnt==r) {//궁수 세명 위치별로 계산 배치됨.
            while(true) {
                int round=0;
                kill();
                for(int i=5;i>0;i--) {
                    map[i]=map[i-1];
                }
                for(int j=0;j<M;j++) {
                    map[0][j] = 0;
                }
                System.out.println("***********"+cc);
                cc++;
                for(int i=0;i<N;i++) {
                    for(int j=0;j<M;j++) {
                        System.out.print(map[i][j]+" ");
                    }
                    System.out.println();
                }
                for(int i=0;i<N;i++) {
                    for(int j=0;j<M;j++) {
                        if(map[i][j] == 1)	round++;
                    }
                }
                if(round==0)	break;
            }
            //while문 돌리면서 궁수가 적들 죽이고 (매 반복마다 사정거리 안에 들어왔는지 검사)
            //만약 D(사정거리)안에 들어오면 1을 0으로 바꿈 ( D = 궁수위치에서 1까지 위치 뺀값)
            //== for문으로 배열 훑으면서 거리가 D 이하인 애들을 지움.
            //적들 한칸씩 전진하고( = map[i+1]에 map[i]를 복사)
            //궁수위치 = (5,0~4(target))
            return;
        }
        if(target == n){
            return;
        }
        archer[target] = true;//조합
        comb(target+1,cnt+1);
        archer[target] = false;
        comb(target+1,cnt);
    }
}
