import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 3, 3, 0, 1, 1};
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(arr[0]));
        // System.out.println(list);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                list.add(arr[i + 1]); }}
        int[] submit = list.stream().mapToInt(i -> i).toArray();
        //return submit;
    }
}

