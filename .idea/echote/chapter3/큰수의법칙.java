package 이코테.chapter3;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.IntStream;

public class 큰수의법칙 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        /*우선순위큐*/
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        IntStream.range(0, N).mapToObj(i -> sc.nextInt()).forEach(pq::add);

        /*최대값 2개 꺼내기*/
        int max1 = pq.poll();
        int max2 = pq.poll();

        /*합계 초기화*/
        int sum = 0;

        /*합계 로직*/
        int v1 = max1 * (M % (K + 1));
        int v2 = (M / (K + 1)) * (K * max1 + max2);
        sum = v2 + v1;
        System.out.println(sum);
    }

}
