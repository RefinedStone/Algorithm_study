public class Main19 {
public static void main(String arr[]){
    String[] seoul = new String[]{"Jane","Kim"};

    String k = "Kim";
    int t =0;

    for(int i = 0; i< seoul.length;i++){
        if(seoul[i].equals(k)){
            t = i;
        }
    }
    System.out.println(t);
    String data = "김서방은 "+t+"에 있다";
    System.out.println(data);
    //return t;

}
}
