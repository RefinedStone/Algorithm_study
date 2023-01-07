class Solution5 {
    public long solution(int a, int b) {
        long answer = 0;
        long c= 0;
        // 대소비교 Math.max(a,b)
        final int Num= Math.min(a,b);
        //절대값 함수 Math.abs(intNum);
        int d = Math.abs(a-b);

        if(d==0){
            System.out.println(Num);
            // System.exit(0);
            answer = Num;
        }
        else{
            if(a<-10000000 || b<-10000000 || a>10000000 || b>10000000){
                System.out.println("변수 범위 초과");
                System.exit(0);
            }


            for(int i=0; i<d+1; i++){
                a = Num + i;
                c+= a;
//            System.out.println("a:"+a);
//            System.out.println("c:"+c);

            }
            System.out.println(c);
            answer = c;

        }
        return answer;
    }
}