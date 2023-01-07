import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {
        int[] numbers =new int[]{2,1,3,4,1};
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                list.add(String.valueOf(numbers[i]+numbers[j]));}}
        List<String> newList = list.stream().distinct().collect(Collectors.toList());
        String[] submit = newList.toArray(new String[0]);
        int[] values = Arrays.stream(submit).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(values);
        //return Arrays.sort(values);
    }
}
