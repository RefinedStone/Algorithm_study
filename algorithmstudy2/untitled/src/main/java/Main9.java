import java.util.ArrayList;

public class Main9 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 7, 6,4};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int countNum = 0;
        //경우의 수 모두 계산하여 리스트 저장
        for (int i = 0; i < 8888; i++) {
            for (int j = 0; j < 99999; j++) {
                for (int k = 0; k < 88888; k++) {
                    list.add(nums[i] + nums[i + j + 1] + nums[i + j + k + 2]);
                    countNum++;
                    if (i + j + k + 2 == nums.length - 1) {
                        break;
                    }
                }
                if (i + j + 1 == nums.length - 2) {
                    break;
                }

            }
            if (i == nums.length - 3) {
                break;
            }
        }

        //System.out.println(countNum);

        int primeCount = 0;
        for (int i = 0; i < countNum; i++) {
            if (CheckPrimeNum(list.get(i)) == true) {
                primeCount++;
            }
        }
        System.out.println(primeCount);
        //return primeCount;
    }

    public static boolean CheckPrimeNum(int numbers) {
        boolean tOrF = true;
        for (int i = 2; i < numbers; i++) {
            if (numbers % i == 0) {
                tOrF = false;
                return tOrF;
            }
        }
        return true;

    }

}
