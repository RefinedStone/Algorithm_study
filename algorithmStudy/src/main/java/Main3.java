import java.util.Scanner;

public class Main3 {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);

        int num;

        //입력받고 string을 int로 변환
        System.out.println("입력하세요");
        String input = scanner.nextLine();
        num = Integer.parseInt(input);

        if (num % 2 == 0) {
            System.out.println("Even 입니다");
        } else if (num % 2 ==1 ) {
            System.out.println("Odd 입니다");
        }
        else{
            System.out.println("오류입니다");
        }
    }
}
