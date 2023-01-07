public class Main29 {
    public static void main(String[] args) {

        int x = 18;
        String s = new String(String.valueOf(x));
        char[] c = s.toCharArray();
        double num=0;
        for (int i = 0; i < s.length(); i++) {
          num= num + Character.getNumericValue(c[i]);
        }
        if(Math.ceil((double)x/num)==Math.floor(((double)x/num))){
            System.out.println(true);
            //return true;
        }
        else{
            System.out.println(false);
            //return false;
        }

       }

}


