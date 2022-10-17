public class Problem18 {

    public static void main(String[] args) {

        int n = 15;
        int answer = 1;


            // i의 최대 시작 값
            int boundary = (n / 2) + 2;
            //합계 초기화
            int sum = 0;
            // 갯수
            //루프
            for (int i = 1; i < boundary; i++) {
                sum = 0;
                for (int j = 0; ; j++) {
                    sum = sum + i + j;
                    if(sum==n){
                        answer++;
                    }
                    else if(sum >= n) {


                        break;
                    }
                }
            }
            System.out.println(answer);

    }
}
