//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class Test21 {
//    static int startingP = 0;
//    static boolean[] visited;
//    static boolean[][] adj;
//    public static void main(String[] args) {
//
//
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        adj = new boolean[n][n];
//
//
//        for (int i = 0; i < adj.length; i++) {
//            adj[scanner.nextInt()-1][scanner.nextInt()-1] = true;
//        }
//        visited = new boolean[n + 1];
//        bfs(1);
//    }
//
//    static void bfs(int start) {
//        Queue<Integer> queue = new LinkedList<Integer>();
//        queue.add(start);
//        visited[start]= true;
//
//        while (!queue.isEmpty()){
//            int cur = queue.poll();
//
//            for (int i = 0; i < adj.length ; i++) {
//                int next = adj[start][i];
//            }
//
//        }
//
//    }
//}
