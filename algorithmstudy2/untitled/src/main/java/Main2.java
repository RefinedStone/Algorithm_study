import java.lang.reflect.Array;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
    int[][] sizes = new int [][]{{60,50},{30,70},{60,30},{80,40}};
    //Arrays.sort(arr);
    for(int[] size: sizes){
        Arrays.sort(size);}
    int maxNum=0, maxNum2=0;
    for(int i=0; i< sizes.length;i++){
        maxNum= Math.max(sizes[i][0],maxNum);
        maxNum2=Math.max(sizes[i][1],maxNum2);
    }
    //return (maxNum*maxNum2);
        System.out.println(maxNum*maxNum2);

    }
}
