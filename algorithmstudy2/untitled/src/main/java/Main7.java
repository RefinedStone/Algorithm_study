import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main7 {
    public static void main(String[] args) {
        //데이터
        int n=2;
        String[] strings= {"abce", "abcd", "cdx","bdae"};

        //시작
        Arrays.sort(strings);
     //   System.out.println(Arrays.toString(strings));

        //Map<Integer, String> map = new HashMap<Integer,String>(strings.length);
        int[] arrayInt = new int[strings.length];
        String[] subString= new String[strings.length];
        StringBuilder[] sbs=Arrays.stream(strings).map(s->new StringBuilder(s)).toArray(StringBuilder[]::new);

            for (int i = 0; i < strings.length; i++) {
            arrayInt[i] =strings[i].charAt(n);
            }
            Arrays.sort(arrayInt);
        //    System.out.println(Arrays.toString(arrayInt));
        //
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length ; j++) {
                if(arrayInt[i]==strings[j].charAt(n)) {
                    if(i==0){
                        subString[i]=strings[j];
                      //  list.add(strings[j]);
                    }
                    if(i>1){
                        if(strings[j].charAt(n)!= subString[i-1].charAt(n)){
                                subString[i] = strings[j];
                                System.out.println(Arrays.toString(subString));
                                //arrayInt[i]=0;
                                break;
                            }
                        else{
                            subString[i+1] = strings[j];
                            System.out.println(Arrays.toString(subString));
                            break;
                        }
                        // System.out.println(subString[i]);
                }}}
    //    System.out.println(list);

        //return subString;

    }
        System.out.println(Arrays.toString(subString));
}}
