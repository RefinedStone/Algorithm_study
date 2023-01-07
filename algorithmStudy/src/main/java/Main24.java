import java.util.Arrays;

public class Main24 {
    public static void main(String arr[]){
        int n =12345;
        String temp_string = String.valueOf(n);
        char[] temp_char = temp_string.toCharArray();
        int[] temp_int = new int[temp_string.length()];

        for(int i=0; i<temp_string.length(); i++){
            temp_int[temp_string.length()-1- i] = Character.getNumericValue(temp_char[i]);
        }
        System.out.println(Arrays.toString(temp_int));
//        //return temp_int;
    }
}
