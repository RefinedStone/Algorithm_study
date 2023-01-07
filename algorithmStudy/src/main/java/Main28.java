public class Main28 {
    public static void main(String[] args) {
        int num = 6;
        int count= 0;

        double numTemp = (double)num;
        if (num == 1) {
            //    return 0;
            System.out.println(0);
        }

        for (int i = 0; i < 500; i++) {
            if(numTemp==1)
            {
                System.out.println(count);
                //return count;
                break;
            }
            else if (numTemp % 2 == 0) {
                numTemp = numTemp / 2;
                count++;
            } else {
                numTemp = numTemp*3 + 1;
                count++;
            }
        }
        //   return -1;
        System.out.println(-1);
    }
}
