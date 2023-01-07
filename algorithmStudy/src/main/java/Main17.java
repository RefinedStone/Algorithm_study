public class Main17 {
    public static void main(String arr[]){
        String s ="pPoooyY";
        int p_count =0;
        int y_count =0;
        boolean j= false;
        int l = s.length();

        for(int i=0; i<l; i++){
           if(s.charAt(i)=='p'||s.charAt(i)=='P'){
               p_count++;
           }
           else if(s.charAt(i)=='y'||s.charAt(i)=='Y'){
               y_count++;
           }
        }

        if(p_count==y_count){
          j= true;
        }
        //return j;
    }
}
