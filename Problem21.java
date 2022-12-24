public class Problem21 {
    public static void main(String[] args) {

        int brown = 4004;
        int yellow = 999999;

        int[] returnArray = new int[2];

        //총 타일갯수, 가장 긴 값
        int all = brown + yellow;
        // 전체 가로 x, 세로 y,
        int x = 0;
        int y = 0;
        // 노랑색의 x, y
        int yellowX = 0;
        int yellowY = 0;
        // 노랑색 y 구하기
        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) {
                yellowY = i;
                System.out.println(yellowY);
                // 가로 x 구하기
                x = brown / 2 - yellowY;
                y = (brown + yellow) / x;
                if (x * y == brown + yellow) {
                    returnArray[0] = x;
                    returnArray[1] = y;
                    break;
                }
            }
        }
        System.out.println(returnArray[0]+","+returnArray[1]);

    }
}
