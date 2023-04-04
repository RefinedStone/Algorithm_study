import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

//11:40
public class 금광 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            var arr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            var dp = new int[n][m];
            for (int i = 0; i < n; i++) {
                Arrays.fill(dp[i], 0);
            }

            //main-logic
            // 2 for loop
            for (int i = 0; i < n; i++) {
                dp[i][0] = arr[i][0];
                for (int j = 1; j < m; j++) {
                    //직진
                    dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + arr[i][j]);
                    //오른쪽 위
                    if (i - 1 >= 0) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + arr[i][j]);
                    }
                    //오른쪽 아래
                    if (i + 1 < n) {
                        dp[i][j] = Math.max(dp[i][j], dp[i + 1][j - 1] + arr[i][j]);
                    }
                }
            }
            System.out.println(IntStream.range(0, n).map(i -> dp[i][m - 1]).max().getAsInt());
    }

}
