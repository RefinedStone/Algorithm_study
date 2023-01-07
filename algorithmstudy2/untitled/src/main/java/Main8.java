import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {

        String s = "Zbcdefg";
        char[] c = s.toCharArray();
        String tempString="";
        String tempString2="";
        Arrays.sort(c);

        //대문자 A 65, 소문자 a = 97
        for (int i =0; i<s.length(); i++) {
            if(c[s.length()-1-i]>96){
                tempString=tempString+String.valueOf(c[s.length()-1-i]);
            }
            else{
                tempString2=tempString2+String.valueOf(c[s.length()-1-i]);
            }
        }
        tempString=tempString+tempString2;
        System.out.println(tempString);
        //return tempString;


    }
}
