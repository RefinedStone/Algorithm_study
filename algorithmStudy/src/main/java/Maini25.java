import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Maini25 {
    public static void main(String[] args) {
        long n = 456781224;
        ArrayList<String> sortedList = new ArrayList<>();
        char[] tempChar = (String.valueOf(n).toCharArray());
        //정렬(오름차순)
        Arrays.sort(tempChar);
        //Stringbuilder
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < tempChar.length; i++) {
            //정렬된 1개의 값들
          s = s.append(tempChar[(tempChar.length-1)-i]);
        }
             long finalNum=Long.parseLong(s.toString());

        System.out.println(finalNum);
        //return finalNum;

    }
}
