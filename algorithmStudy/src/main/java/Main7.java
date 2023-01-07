public class Main7 {
    public static void main(String arr[]) {
        int[] numbers = new int[]{1,2,3,5,7,8};
        int[] myNum = new int[]{0,1,2,3,4,5,6,7,8,9};
        int myNum2=0;
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<10; j++){
                if(numbers[i] == myNum[j]){
                    myNum[j]=0;
                }
            }
    char a = 'a';
            char b = 'b';
            Math.max((int)a,(int)b);
        }
        for (int i=0; i<10; i++) {
          //  System.out.println(myNum[i]);
            myNum2= myNum2+myNum[i];
        }
        System.out.println(myNum2);
       // return myNum2;
        }
    }


