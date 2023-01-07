public class Main11 {
    public static void main(String[] args) {
        String s = "ABcdefg";
        int n = 1;

        //시작
        char[] cArray= s.toCharArray();

        // A = 65, a= 97
        for(int j=0; j<n; j++){
            for (int i = 0; i < s.length(); i++) {
                if(cArray[i]<97){
                    // 이건 대문자
                    if(cArray[i] == 90){
                        cArray[i]=65;
                    }
                    else if(cArray[i]==32){

                    }
                    else {
                        cArray[i] = (char) (cArray[i] + 1);
                    }
                }
                else{
//                소문자
                    if(cArray[i]==122){
                        cArray[i]=97;
                    }
                    else{
                        cArray[i] = (char) (cArray[i] + 1);
                    }

                }
            }
        }


        //return cArray.toString();
        String s2 = new String(cArray);
        System.out.println(s2);
        //return s2;
    }
}
