public class Problem16 {
    public static void main(String[] args) {
        int k=1;
        int d=5;

        int pSum=0;
        for (int i = 0; ; i++) {
            long x =k*i;

            for (int j = 0;; j++) {
                long y=k*j;
                if(d<k){
                    break;
                }
                if( d >= k*Math.sqrt((i*i)+(j*j))){
                    pSum++;
                    System.out.println("x: "+x+","+"y: "+y);

                }
                else{
                    break;
                }
            }
            if(x>d){
                break;
            }
        }

        System.out.println(pSum);
    }
}
