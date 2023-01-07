class Solution7 {
    public int solution(int[] numbers) {
        int[] myNum = new int[]{0,1,2,3,4,5,6,7,8,9};
        int myNum2=0;
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<10; j++){
                if(numbers[i] == myNum[j]){
                    myNum[j]=0;
                }
            }

        }
        for (int i=0; i<10; i++) {
            //System.out.println(myNum[i]);
            myNum2= myNum2+myNum[i];
        }
        return myNum2;
    }
}