public class Main16 {
    public static void main(String arr[]){

        int[] a= new int[]{1,2,3,4};
        int[] b =new int[]{-3,-1,0,2};
        int c =0;
        for(int i=0; i<a.length; i++) {
         c+=  a[i]*b[i];
        }
       // return c;
        System.out.println(c);
    }
}
