
public class Problem14 {


    public static void main(String[] args) {

        int n = 15;
        // 1.  m > n

        // 2. 2진수 변환시 1의 갯수
        String s = Integer.toString(n, 2);
        //1 개수세기
        int count =(int) s.chars()
                .filter(c -> c == '1')
                .count();

        System.out.println(count);

        //for문
//        int x = n;


        int i = 1;
        while (true) {
//            x=x+1;
            n++;
            int count2 = 0;
            String s1 = Integer.toString(n, 2);
//            System.out.println(s1);
            //갯수 세기
          //  count2 = s1.chars().filter(c->c=='1').count();
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == '1') {
                    count2++;
//                    System.out.println(count2);
                }
            }
            System.out.println(count+":"+count2);
            if (count == count2) {

                break;
            }


            i++;
        }
        System.out.println(n);


    }
}