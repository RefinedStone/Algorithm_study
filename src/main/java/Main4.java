import java.util.Scanner;

public class Main4 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
//        단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
//        단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//          제한사항
//        s는 길이가 1 이상, 100이하인 스트링입니다.
        //입력받기
         System.out.println("입력하세요");
         String input = scanner.nextLine();
        //String input = "안녕하세요";

        char c=' ';
        // 스트링의 길이를 받아옴
        int b = input.length();
        //초과범위 일 경우 종료
        if (b<1 || b>100){
            System.out.println("\n\t초과범위로 프로그램을 종료합니다.");
            System.exit(0);
        }

        if(b % 2 ==0){
            int b_2 = (b/2);
            char a= input.charAt(b_2-1);
            c= input.charAt(b_2);
            System.out.println(a+""+c);
            //System.out.println(a+c); ->이것은 왜 작동을 안할까?


        } else if (b % 2 == 1) {
            int b_1 = (b/2);
            char a = input.charAt(b_1);
            System.out.println(a);
        }
       // char a = input.charAt(1);
       // System.out.println(a);
    }
}
