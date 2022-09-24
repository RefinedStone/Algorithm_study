public class Main18 {
    public static void main(String arr[]){
        String s ="a234";
        boolean data= false;
        //숫자 범위 48~57
      if(s.length()==4 || s.length()==6){
            data= true;
            for(int i=0;i<s.length();i++)
            {
              if(s.charAt(i)>57 ||s.charAt(i)<48){
                  data= false;
              }
            }

        }
        //return data;
    }
}
