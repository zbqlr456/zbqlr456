import java.util.Arrays;
import java.util.HashMap;

public class 롯데e커머스_김응철_과제 {

    static HashMap<Long, Long> hope_room = new HashMap<>();;
//    static long[] parents; index의 최대크기는 Integer 범위 안이라 배열을 쓰지 못하였다

    public static void main(String[] args) {

        int[] room_number = {1, 3, 4, 1, 3, 1};
        System.out.println(Arrays.toString(Solution(10, room_number)));
    }

    public static long[] Solution(long k, int[] room_number) {

        long[] result = new long[room_number.length];

        for(int i=0; i<room_number.length; i++){
            result[i] = find(room_number[i]);
        }

        return result;
    }

    public static long find(long room){
        if(!hope_room.containsKey(room)){
            hope_room.put(room, room+1);
            return room;
        }

        hope_room.put(room,find(hope_room.get(room))+1);
        return hope_room.get(room)-1;
    }

}