import java.util.Arrays;

public class Problem12 {
    public static void main(String[] args) {
        //최댓값 만들기 (1)
        //https://school.programmers.co.kr/learn/courses/30/lessons/120847
        int[] numbers= new int[]{0, 31, 24, 10, 1, 9};

        Arrays.sort(numbers);

        int answer = numbers[numbers.length-1]*numbers[numbers.length-2];

        //return answer;
    }
}
