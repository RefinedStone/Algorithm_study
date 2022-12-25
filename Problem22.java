import java.util.*;
import java.util.stream.Collectors;

public class Problem22 {
    public static void main(String[] args) {

        int[] arr = {2, 6, 8, 14};

        Set<Integer> set = new HashSet<>();
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<List<Integer>> listList = new ArrayList<>();
        var r = new ArrayList<Integer>();
        //배열당, 약수 화
        for (int i = 0; i < list.size(); i++) {
            r.clear();
            for (int j = 1; j <= list.get(i); j++) {
                if (list.get(i) % j == 0) {
                    r.add(j);
                }
            }
//            listList.
        }
        System.out.println(set);
        //리스트 화
        List<Integer> list2 = set.stream().map(x -> x).collect(Collectors.toList());
        for (int i = 0; i < list2.size(); i++) {
            for (int j = 2; j <= list2.get(i); j++) {
                if (list2.get(i) != j && list2.get(i) % j == 0) {
                    set.remove(list2.get(i));
                }
            }
        }
        //최종배열 구하기
        System.out.println(set);
        //리스트 화
        List<Integer> list3 = set.stream().map(x -> x).collect(Collectors.toList());
        //최소공배수 구하기
        int answer = 1;
        for (Integer num : list3) {
            answer = answer * num;

        }
        System.out.println(answer);
    }

}
