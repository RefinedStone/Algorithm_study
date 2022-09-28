public class Main5 {
    public static void main(String[] args) {
        int[] lottos = new int[]{45, 4, 35, 20, 3, 9};
        int[] win_nums = new int[]{20, 9, 3, 45, 4, 35};

        int zNum=0;
        int mNum=0;
        for (int i = 0; i < 6; i++) {
           for (int j = 0; j <6; j++) {
                 if(lottos[i]==0){
                   zNum++;
                   break;
                 }
                if(lottos[i]==win_nums[j]){
                    //System.out.println("매칭 성공");
                    mNum++;
                }
            }
           }
        //0갯수,매칭갯수
        System.out.println(zNum);
        System.out.println(mNum);
        //등수 산정
        int lowNum=7-mNum;
        if(mNum==0){
            lowNum=6;
        }
        int highNum=7-(mNum+zNum);
        if(mNum+zNum==0){
           highNum=6;
        }
        System.out.println(highNum+","+lowNum);
        int[] answer = {highNum,lowNum};
       // return answer;

}}
