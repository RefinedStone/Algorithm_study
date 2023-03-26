package 이코테.chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*4:58 시작*/
public class 특정거리도시찾기 {
    //    static boolean[] visited;
    static int k;
    static int x;
    static int answer=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*도시갯수*/
        int n = sc.nextInt();
        /*도로갯수*/
        int m = sc.nextInt();
        /*거리정보*/
        k = sc.nextInt();
        /*출발도시*/
        x = sc.nextInt();
        List<List<Integer>> list = IntStream.range(0, m).mapToObj(i -> List.of(sc.nextInt(), sc.nextInt())).collect(Collectors.toList());
        boolean[] visited = new boolean[m];
        IntStream.range(0, m).filter(i -> list.get(i).get(0) == x).forEach(i -> DFS(i, list, visited,0));
        if(answer==0) answer=-1;
        System.out.println(answer);
    }

    static void DFS(int i, List<List<Integer>> list, boolean[] visited, int distance) {
        /*condi 1*/
        if(distance==k){
            answer++;
            return;
        }
        /*condi 2*/
        for (int j = 0; j < list.size(); j++) {
            if (list.get(i).get(1) == list.get(j).get(0) && i!=j) {
                if (!visited[j]) {
                    /*visit*/
                    visited[j] = true;
                    /*거리 측정*/
                    DFS(j, list,visited,distance+1);
                }
            }
        }

    }
}
