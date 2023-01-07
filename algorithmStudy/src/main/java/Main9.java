public class Main9 {
    public static void main(String arr[]) {

            int[] arrTemp = new int[]{5, 6, 7, 8};
            int num = arrTemp.length;
            int sum = 0;

            for (int i = 0; i < arrTemp.length; i++) {
                sum += arrTemp[i];
            }
            double sum2 = (double) sum / arrTemp.length;
            //return sum2;
            System.out.println(sum2);

    }
}