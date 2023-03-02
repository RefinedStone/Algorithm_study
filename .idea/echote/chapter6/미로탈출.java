package 이코테.chapter6;

import java.util.*;

public class 미로탈출 {

    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] array = new int[n][m];

        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                array[i][j] = s.charAt(j) - '0';
            }
        }
        BFS(0, 0, n, m, array);
        System.out.println(array[n - 1][m - 1]);
    }

    private static void BFS(int x, int y, int n, int m, int[][] array) {
        Queue<List<Integer>> q = new LinkedList<>();
        q.add(new ArrayList<>(List.of(x, y)));

        while (!q.isEmpty()) {
            /*q꺼내기*/
            List<Integer> coor = q.poll();
            /*방문*/
            visited[x][y] = true;

            for (int i = 0; i < 4; i++) {
                int X = coor.get(0) + dx[i];
                int Y = coor.get(1) + dy[i];
                /*범위 조건*/
                if (X >= 0 && X < n && Y >= 0 && Y < m) {
                    /*이동 조건*/
                    if (array[X][Y] != 0 && !visited[X][Y]) {
                        /*방문조건*/
                        /*새로운 좌표 q에 등록*/
                        q.add(new ArrayList<>(List.of(X, Y)));
                        /*방문*/
                        visited[X][Y] = true;
                        /*완료 조건*/
                        array[X][Y] = array[coor.get(0)][coor.get(1)] +1;
                    }
                }

            }
        }
    }
}
