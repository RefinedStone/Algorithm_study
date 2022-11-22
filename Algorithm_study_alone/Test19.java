//https://www.acmicpc.net/problem/2517
//달리기

import java.util.*;

public class Test19 {

    public static void main(String[] args) {
        List<Integer> persons = new ArrayList<Integer>();
//        persons.add(2);
//        persons.add(8);
//        persons.add(10);
//        persons.add(7);
//        persons.add(1);
//        persons.add(9);
//        persons.add(4);
//        persons.add(15);

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            persons.add(sc.nextInt());
        }

        //
        for (index = 0; index < persons.size(); index++) {
            DFS(persons, index, pqr);
//            Collections.sort(pq, Collections.reverseOrder());
                 System.out.println(pq.indexOf(persons.get(index)) + 1);
//                 int k=pqr.indexOf(15);
            pqr.clear();
        }

    }

    /*DFS
     * Depth
     * First
     * Search
     * */
    static Integer index = 0;
    static PriorityQueue<Integer> pqr = new PriorityQueue<>();
    static List<Integer> pq = new ArrayList<>();

    static void DFS(List<Integer> persons, Integer depth, PriorityQueue<Integer> pqr) {
        //조건
        if (depth < 0) return;
        //출력
        Integer pp = persons.get(depth);
        if (pp >= persons.get(index)) {
            pqr.add(pp);
        }
        //DFS
        DFS(persons, depth - 1, pqr);
    }
}
