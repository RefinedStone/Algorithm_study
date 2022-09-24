public class Main20 {
    public static void main(String arr[]){
        int n=5;
        String s1 = "수";
        String s2 = "박";
        String s3 = "";
        for(int i=0; i<n; i++){
            if(i%2==0){
                s3 +=s1;
            }
            else{
                s3 +=s2;
            }
        }
        //return s3;
    }

}
