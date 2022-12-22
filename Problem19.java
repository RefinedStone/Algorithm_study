import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Problem19 {
    public static void main(String[] args) {
        //인풋
        int[] citations = new int[]{4, 4, 4};
        // list 변경
        var collect = Arrays.stream(citations).boxed().collect(Collectors.toList());
        //
        Collections.sort(collect);
        System.out.println(collect);
        //인용횟수 n , 논문 갯수 m, 나머지 k
        int n = 0;
        int m = 0;
        int num = 0;
        int hIndex = 0;

        for (int i = 0; i < collect.get(collect.size()-1); i++) {
            // i보다 큰 collect index num 값을 알아낸다.
            for (int j = 0; j < collect.size(); j++) {
                if (i <= collect.get(j)) {
                    num = j;
                    break;
                }
            }
            //num은 i보다 작은 최소한의 index 번호
            //n 인용횟수
            n = i;
            // m 논문 갯수
            m = collect.size() - num;
            System.out.println("n: "+n+",m: "+m);
            //


//            System.out.println(n+","+m);
            if (m >= n) {
                hIndex = n;
                System.out.println(hIndex);
            }
        }
    }
}
