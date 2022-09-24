import java.util.Arrays;

public class Main15 {
    public static void main(String arr[]){
        int[] arrTemp= new int[]{5,9,7,10};
        int[] errArray=new int[]{-1};
        int divisor = 5;
        int j=0;
        for(int i=0; i<arrTemp.length; i++){
            if((arrTemp[i]%(divisor)) != 0){
                arrTemp[i]=0;
            }
            else {
               j++;
            }
        }
        Arrays.sort(arrTemp);
        int[] lastArray = new int[j];
            if(j==0){
                lastArray= errArray;
            }
            else {
                    for (int i = 0; i < j; i++) {
                    lastArray[i] = arrTemp[arrTemp.length - j + i];
                }
            System.out.println(lastArray[0]);
            }
        }
    }
