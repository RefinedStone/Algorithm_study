public class Main22 {
    public static void main(String arr[]) {
        String s = "try hello world";
        int s_number = s.length();
        int[] intArray = new int[s_number];
        char[] new_char= new char[s_number];
        char[] s_char = s.toCharArray();
        int s_check = 0;

        //  s.charAt(0);
//        char test1='a';
//        char test2='A';
//        System.out.println((int)test1+","+(int)test2);

        //대문자와 소문자의 차이가 32, A값이 97
        //Character.isWhitespace(char)

        // System.out.println(Character.isWhitespace(s_char[4]));

        // 빈칸 갯수 체크, 빈칸 위치 체크
        for (int i = 0; i < s_number; i++) {
            if (Character.isWhitespace(s.charAt(i))) {
                s_check++;
                intArray[i] = 1; //빈칸이면 1 리턴
            }}
        //string.split()
        //빈칸 갯수만큼 스플릿 s_2에 저장
       String[] s_2 = s.split(" ", s_check + 1);

        //
        int j=0;
        int k=0;
        for (int i = 0; i < s_number; i++) {
            k = j%2;
            //빈칸이면 -> 빈칸으로
            if (intArray[i] == 1) {
                //s_char[i] = ' ';
                j =-1;
             }
            else{
                //짝수자리+소문자면 대문자로 변경
                if (k == 0 && (int) s_char[i] > 96) {
                    s_char[i] = (char) ((int) s_char[i] - 32);
                    }
                //홀수자리면 소문자로 변경
                else if(k==1 && (int) s_char[i] < 97){
                        s_char[i] = (char) ((int) s_char[i] + 32);
                     }
                 }
            //홀짝자리 판별
//            System.out.println(k);
            System.out.println(i+"번째:"+s_char[i]+" , j:"+j +" 빈칸체크"+intArray[i]);
            j++;
        }
       String answer = new String(s_char);
       //        return answer;

    }


        }
