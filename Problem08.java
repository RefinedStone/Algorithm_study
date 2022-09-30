public class Problem08 {
    public static void main(String[] args) {
        //배열의 평균값
        //https://school.programmers.co.kr/learn/courses/30/lessons/120817
        int[] numbers=new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double sum = 0;
        for (int number : numbers) {
            sum = number + sum;
        }
        sum=sum/ numbers.length;
        return sum;
    }
}
