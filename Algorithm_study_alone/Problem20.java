public class Problem20 {
    public static void main(String[] args) {

        int brown = 10;
        int yellow = 2;

        int[] returnArray = new int[2];
        //총 타일갯수, 가장 긴 값
        int all = brown + yellow;
        // 가로 x, 세로 y,
        int x = 0;
        int y = 0;
        // x값 제한
        int boundary = brown / 2 - 1;
        for (int i = boundary; i >= 1; i--) {

            if (all % i == 0) {
                x = i;
                y = all / i;

                returnArray[0] = (x > y) ? x : y;
                returnArray[1] = (x > y) ? y : x;
                break;
            }
        }
        System.out.println(returnArray[0] + "," + returnArray[1]);
//        return returnArray;
    }
}
