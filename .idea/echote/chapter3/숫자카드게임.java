package 이코테.chapter3;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 숫자카드게임 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                pq1.add(sc.nextInt());
            }
            pq2.add(pq1.poll());
            pq1.clear();
        }
        System.out.println(pq2.poll());
    }
}
