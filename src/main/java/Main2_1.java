import java.util.Scanner;

public class Main2_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
//        표준입력:정수n 정수 m
//        n값 세팅
        String nNum="";
        for(int i=0; i<a; i++) {
            nNum += "*";
        }
        //System.out.println(nNum);


//        별출력
        String nNum2 ="";

        for(int i=0; i <b; i++) {
            nNum2+=nNum+"\n";
        }
        //nNum2 = (nNum+"\n"+nNum);
        System.out.println(nNum2);
    }
}
