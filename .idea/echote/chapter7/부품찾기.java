package 이코테.chapter7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class 부품찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = IntStream.range(0, sc.nextInt()).map(i -> sc.nextInt()).sorted().toArray();
        int[] array2 = IntStream.range(0, sc.nextInt()).map(i -> sc.nextInt()).sorted().toArray();
        for (int i = 0; i < array2.length; i++) {
            if(Arrays.binarySearch(array, array2[i])<0) System.out.print("no" + " ");
            else System.out.print("yes"+" ");
        }
    }
}
