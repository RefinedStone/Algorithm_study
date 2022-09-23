class Solution6 {
    public int solution(String s) {
        int answer = 0;
        // 스트링을 char로 변환
        char[] a = s.toCharArray();
        //signvalue = 부호 식별자
        int signValue=1;
        // -의 유니코드 45, +의 유니코드 43
        if((int)a[0]==45){
            a[0]=48;
            signValue = -1;
            // System.out.println("-부호를 가졌습니다");
        }
        else if((int)a[0]==43){
            a[0]=48;
            // System.out.println("+부호를 가졌습니다");
        }

        // array 길이
        int len = a.length;
        int intArray[] = new int[a.length];
        //
        for (int i = 0; i < a.length; i++) {
            intArray[i] = (int) (1 * Math.pow(10, (double) i));
            //System.out.println(intArray[i]);
        }

        //최종값 lastValue
        int lastValue =0;


        // Character.getNumericValue(c1)을 쓰면 char->int 변형이 가능하지만 원시적인 코드로 해결해보려함
        // char을 int로 아스키코드의 0값이 48
        for (int i = 0; i < a.length; i++) {
            //지수 표현 Math.pow(3, 2) -> double값
            //array 값이 1,10,100,1000.... 으로 지정
            int temp_length = (a.length -1)-i;
            intArray[i] = (int) (1 * Math.pow(10, (double) temp_length));
            if((int) a[i]==45 ||(int) a[i]==43){
                a[i]=48;
            }
            int temp = (int) a[i] - 48;
            int temp_2 =  temp*intArray[i];
            lastValue += temp_2;
            //  System.out.println(lastValue);
        }


        lastValue = lastValue*signValue;
        return lastValue;
    }
}