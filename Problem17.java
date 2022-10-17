import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem17 {


    public static void main(String[] args) {
        M17 m17 = new M17();
        int[][] dungeons = new int[][]{{80, 20}, {50, 40}, {30, 10}};
        int k = 80;


        for (int i = 0; i < dungeons.length; i++) {
            m17.remainedHp(k, i, dungeons).get(0);


        }


    }


}

class M17 {
    public int myHp;
    public int remainedHp;

    public List<Integer> remainedHp(int k, int i, int[][] dungeons) {
        var r = new ArrayList<Integer>();
        if (k >= dungeons[i][0]) {

            r.set(0, k - dungeons[i][1]);
            r.set(1, r.get(1) + 1);
        }
        return r;

    }


    public M17() {
    }
}

