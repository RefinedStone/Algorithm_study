public class Main14 {
public static void main(String arr[]){
    int a=1;
    int b=1;
    int[] monthArray= new int []{0,31,29,31,30,31,30,31,31,30,31,30,31};
    String[] day= new String[]{"THU","FRI","SAT","SUN","MON","TUE","WED"};
    int sumDay=0;
    String answer ="";
    for(int i=0; i<a; i++) {
      sumDay = sumDay+monthArray[i];
//        System.out.println(i);
//        System.out.println(sumDay);
    }
    sumDay+=b;
    int week= sumDay%7;
    System.out.println(week);
    answer=day[week];
    System.out.println(answer);
    //    return answer;

}
}

