

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Main27 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 7, 5, 8,9,2,7,3};
        int[][] arr2 = new int[2][];
        arr2[0] = new int[arr.length-1];
        arr2[1] = new int[1];
        arr2[1][0] = -1;
        int switchNum = 0;

        ArrayList<Integer> arr_temp = new ArrayList<>();
        int minN = arr[0];
        if (arr.length == 1) {
           // arr_temp.add(-10);
            switchNum=1;
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                minN = Math.min(minN, arr[i]);
                arr_temp.add(arr[i]);
            }
            //System.out.println(minN);
            arr_temp.remove(new Integer(minN));
            //Arrays.sort(arr_temp);
            for (int i = 0; i < arr.length-1; i++) {
                arr2[0][i] = arr_temp.get(i).intValue();
              //  System.out.println(arr2[0][i]);
            }
        }
       // System.out.println(Arrays.toString(arr2[0]));
       //return arr2[switchNum];
    }
}
