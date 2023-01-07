import java.util.ArrayList;
import java.util.HashMap;

public class Main1_1 {
    public static void main(String[] args) {
        //10진수-> 3진수 만드는
        // int tenNum =n;
        long tenNum = 45;
        long tempNum = 0;
        String tenToString = String.valueOf(tenNum);
        char[] tenToCharArray = tenToString.toCharArray();
        int numberLength = tenToCharArray.length;

        int topNum = 0;
        int bottomNum = 0;
        int frontNum = 0;
        int count =0;

        HashMap<Integer, Long> map = new HashMap<Integer, Long>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; ; i++) {
            tempNum = (long)Math.pow(3, i);
            if(tenNum<3){
                map.put(0,tenNum);
                //  System.out.println(map);
                break;
            }
            else if (tenNum < tempNum) {
                topNum = i - 1;
                if(count==0){
                    count =i-1;

                }
                // System.out.println(topNum);

                for (int j = 0;  ; j++) {
                    if (tenNum < j *  Math.pow(3, topNum)){
                        frontNum = j - 1;
                        map.put(i - 1, (long)j - 1);
                        i=0;
                        tenNum = tenNum-(int) (frontNum * Math.pow(3, topNum));

                        break;
                    }
                }
            }
        }
        System.out.println(map);

        for (int i = 0; i < count+1; i++) {
            if(map.get((count)-i)==null){
                map.put((count)-i, (long)0);
            }
            //정순이라면->
            // stringBuilder.append(map.get((4-1)-i));
        }
        for (int i = 0; i < count+1; i++) {
            //역순이라면->
            stringBuilder.append(map.get(i));
        }
        System.out.println(map);
        System.out.println("count: "+count);
        System.out.println(stringBuilder.toString());

        //10진수 -> 3진수 ->역순3진수까지 끝
        long numbers = Long.parseLong(stringBuilder.toString());

        //3진수-> 10진수 함수;
        tempNum = 0;
        String thirdToString = String.valueOf(numbers);
        char[] thirdToCharArray = thirdToString.toCharArray();
        numberLength = thirdToCharArray.length;

        for (int i = 0; i < numberLength; i++) {
            tempNum = (long)(tempNum + Character.getNumericValue(thirdToCharArray[i]) * Math.pow(3, numberLength - 1 - i));

        }

        System.out.println((int)tempNum);
        // return (int)tempNum;


    }}



