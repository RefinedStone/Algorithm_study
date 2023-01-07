class Solution4 {
    public String solution(String s) {
        String answer = "";

        // String s = "asdf";

        char c=' ';
        // 스트링의 길이를 받아옴
        int b = s.length();
        //초과범위 일 경우 종료
        if (b<1 || b>100){
            System.out.println("\n\t초과범위로 프로그램을 종료합니다.");
            System.exit(0);//return도 가능
        }

        if(b % 2 ==0){
            int b_2 = (b/2);
            char a= s.charAt(b_2-1);
            c= s.charAt(b_2);
            answer = String.valueOf(a)+String.valueOf(c);
            //System.out.println(a+c); ->이것은 왜 작동을 안할까?


        } else if (b % 2 == 1) {
            int b_1 = (b/2);
            char a = s.charAt(b_1);
            answer = String.valueOf(a);
        }
        return answer;
        // char a = input.charAt(1);
        // System.out.println(a);

    }
}