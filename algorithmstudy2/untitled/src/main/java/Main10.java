import java.util.HashMap;
import java.util.Map;

public class Main10 {
    public static void main(String[] args) {

        String s = "one4seveneight";

//        StringBuilder sb = new StringBuilder();
//        StringBuilder enToNum = new StringBuilder();
//        //enToNum ={"one","two","three","four","five","six","seven","eight","nine"};
//        sb.append(s);
        s=s.replace("zero","0");
         s=s.replace("one","1");
        s=s.replace("two","2");
        s=s.replace("three","3");
        s=s.replace("four","4");
        s=s.replace("five","5");
        s=s.replace("six","6");
        s=s.replace("seven","7");
        s=s.replace("eight","8");
        s=s.replace("nine","9");
        System.out.println(s);
        //return Integer.parseInt(s);

    }
}
