package 이코테.chapter4;

import java.util.Scanner;

public class 럭키스트레이트 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = String.valueOf(n);
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > (s.length() / 2) - 1) {
                left = left + (s.charAt(i) - '0');
            } else {
                right = right + (s.charAt(i) - '0');
            }
        }
        if (left == right) System.out.println("LUCKY");
        else System.out.println("READY");
    }

}
