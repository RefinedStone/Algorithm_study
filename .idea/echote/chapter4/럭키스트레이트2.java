package 이코테.chapter4;

import java.util.Scanner;

public class 럭키스트레이트2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int mid = s.length() / 2; /*무조건 2로 나누어짐*/
        /*left,right 합연산*/
        int left = sum(s.substring(0, mid));
        int right = sum(s.substring(mid));
        System.out.println(left == right ? "LUCKY" : "READY"); /*결과*/
    }

    static int sum(String s) {
        return s.chars().map(Character::getNumericValue).sum();
    }

}
