
public class Main {
    public static void main(String args[]){
        int z=0;
        while(z != 5) {
            //      2개의 랜덤변수 선언
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
                z = x + y;

            System.out.println("x:" + x + ", y:" + y);
            System.out.println(z);

        }
        System.out.println("끝입니다");
    }
}
