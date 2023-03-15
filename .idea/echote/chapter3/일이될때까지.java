package 이코테.chapter3;

import java.util.Scanner;

public class 일이될때까지 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        int answer = 0;

        while(N!=1){
            if(N % K == 0 && N >=K){
                N = N/K;
            }
            else N--;
            answer++;
        }
        System.out.println(answer);

    }
}
