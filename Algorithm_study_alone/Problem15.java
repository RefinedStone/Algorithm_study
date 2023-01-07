public class Problem15 {
    public static void main(String[] args) {
        String s ="(())()";
        boolean answer=true;
        int sum = 0;
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)=='('){
                sum =sum+1;
            }
            else{
                sum = sum -1;
                if(sum<0){
                    answer=false;
                    break;}
            }
        }
        if(sum!=0){
            answer=false;
        }
        System.out.println(answer);
    }
}
