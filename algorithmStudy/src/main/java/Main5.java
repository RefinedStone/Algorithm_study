import java.util.Scanner;

public class Main5 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
//        두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수
//       solution을 완성하세요.
//        예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
//
//        제한 조건
//        a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
//                a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
//        a와 b의 대소관계는 정해져있지 않습니다.\
        // a, b 입력
        System.out.println("a입력하세요");
        int a = scanner.nextInt();
        System.out.println("b입력하세요");
        int b = scanner.nextInt();
        int c= 0;
        // 대소비교 Math.max(a,b)
        final int Num= Math.min(a,b);
        //절대값 함수 Math.abs(intNum);
        int d = Math.abs(a-b);

        if(d==0){
            System.out.println(Num);
            return;
        }

        if(a<-10000000 || b<-10000000 || a>10000000 || b>10000000){
            System.out.println("변수 범위 초과");
            return;
        }


        for(int i=0; i<d+1; i++){
            a = Num + i;
            c+= a;
//            System.out.println("a:"+a);
//            System.out.println("c:"+c);

        }
        System.out.println(c);



    }
}
