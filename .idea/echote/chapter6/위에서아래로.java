package 이코테.chapter6;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.IntStream;


public class 위에서아래로 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        IntStream.range(0,n).forEach(i->pq.add(sc.nextInt()));
        IntStream.range(0,n).forEach(i->System.out.print(pq.poll()+" "));

    }
}
