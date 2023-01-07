public class Problem16_2 {
    public static void main(String[] args) {
        int k = 1;
        int d = 5;

        int pSum = 0;

        float r = (d / k);
        System.out.println(r);
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (r >=Math.sqrt((i * i) + (j * j))) {
                    pSum++;
                    System.out.println(Math.sqrt((i * i) + (j * j)));
                }
                else {
                    break;
                }
            }
            if(i>=r){
                break;
            }
        }
        System.out.println(pSum);
    }
}
