import java.util.ArrayList;
import java.util.List;

public class Problem24 {
    public static void main(String[] args) {
        int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};


        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i <arr1.length ; i++) {
            int sum = 0;
            var temp = new ArrayList<Integer>();

            for (int j = 0; j <arr2[0].length ; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    sum = sum + arr1[i][k] * arr2[k][j];
                }
                temp.add(sum);
            }
            list.add(temp);
        }
        System.out.println(list);





//        int sum = 0;
//        sum = sum + arr1[0][0] * arr2[0] [0];
//        sum = sum + arr1[0][1] * arr2[1] [0];
//        sum = sum + arr1[0][2] * arr2[2] [0];
//        System.out.println(sum);
//        sum = 0;
//        sum = sum + arr1[0][0] * arr2[0] [1];
//        sum = sum + arr1[0][1] * arr2[1] [1];
//        sum = sum + arr1[0][2] * arr2[2] [1];
//        System.out.println(sum);
    }
}
