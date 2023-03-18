package 이코테.chapter6;

import java.util.Scanner;

public class 음료수얼려먹기 {
    static int[][] array;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        array = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                array[i][j] = s.charAt(j) - '0';
            }
        }
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (DFS(i, j)) answer++;
            }
        }
        System.out.println(answer);
    }

    static boolean DFS(int x, int y) {
        /*갈수없는 곳*/
        if (x < 0 || y < 0 || x > n - 1 || y > m - 1) return false;
        /*방문처리*/
        if (array[x][y] == 0) {
            array[x][y] = 1;
            for (int i = 0; i < 4; i++) DFS(x + dx[i], y + dy[i]);
            return true;
        }
        return false;
    }
}
