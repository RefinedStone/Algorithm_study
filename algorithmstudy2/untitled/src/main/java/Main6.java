import java.util.ArrayList;
import java.util.Arrays;

public class Main6 {
    public static <Arraylist> void main(String[] args) {
        int[] answers = {1,3,2,4,2};

        //a, b, c 인트 어레이
        int[] a = new int[answers.length];
        int[] b = new int[answers.length];
        int[] c = new int[answers.length];
        int[] b_temp = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c_temp = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] numCount ={0,0,0};


        // 맞는 갯수 세기
        for (int i = 0; i < answers.length; i++) {
            a[i] = (i % 5) + 1;
            b[i] = b_temp[i % 8];
            c[i] = c_temp[i %10];
            if (a[i] == answers[i]) {
                numCount[0]++;
            }
            if (b[i] == answers[i]) {
                numCount[1]++;
            }
            if (c[i] == answers[i]) {
                numCount[2]++;
            }
        }

        //검사
        System.out.println(Arrays.toString(numCount));
        //등수 정하기
        ArrayList<Integer> rank= new ArrayList<Integer>();
         int temp_count = Math.max(Math.max(numCount[0],numCount[1]),numCount[2]);
        for (int i = 0; i < 3; i++) {
            if(numCount[i] == temp_count){
               rank.add (i+1);
            //    System.out.println(rank);
            }
         }
        int[] arr2 = rank.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(arr2));
    }
}
