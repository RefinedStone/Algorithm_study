public class Main23 {
    public static void main(String arr[]){

        int n = 12350;
        //int 값을 String으로 받아서
        String temp_string = String.valueOf(n);
        int times = temp_string.length();
        // char로 분할
        char[] temp_char = temp_string.toCharArray();
        int[] temp_int= new int[times];
        int sum=0;

        for(int i=0;i<times;i++){
        temp_int[i]= Character.getNumericValue(temp_char[i]);
        sum += temp_int[i];
        }

        System.out.println(sum);
        //return sum;
    }
}
