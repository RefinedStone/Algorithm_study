import java.util.Scanner;

public class Main2 {
    public static void main(String args[]) {

//        표준입력:정수n 정수 m
        Scanner scanner = new Scanner(System.in);
        System.out.println("n을입력하시오");
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);

        System.out.println("m을입력하시오");
        input = scanner.nextLine();
        int m = Integer.parseInt(input);
//        n값 세팅
        String nNum="";
        for(int i=0; i<n; i++) {
            nNum += "*";
        }
        //System.out.println(nNum);

//        별출력
        for(int i=0; i <m; i++) {
            System.out.println(nNum);
        }
    }
}
