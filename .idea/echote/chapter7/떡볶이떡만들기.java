package 이코테.chapter7;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 떡볶이떡만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> collect = IntStream.range(0, n).mapToObj(i -> sc.nextInt()).collect(Collectors.toList());
        /*main-logic*/
        Collections.sort(collect, Collections.reverseOrder());
        /*칼의 범위 0 ~ 최대 떡*/

        int start = 0;
        int end = collect.get(0);
        int mid = 0;
        int result=0;

        while (start <= end) {
            mid = (start + end) / 2;
            /*M보다 작으면*/
            if (calculate(collect, mid) < m) end = mid-1;
            /*M보다 크면*/
            else {
                result = mid;
                start = mid +1;
            }
        }
        System.out.println(mid);

    }

    /*계산*/
    static int calculate(List<Integer> collect, int mid) {
        return collect.stream().filter((i) -> (i - mid) < 0).mapToInt(i -> i - mid).sum();
    }

}
