public class Main8 {
public static void main(String arr[]){

    int[] absolutes = new int[]{1,2,3,4,5};
    boolean[] signs = new boolean[]{false,false,true,true,true};
    int sum=0;

  for (int i=0; i<absolutes.length; i++)
  {
      if(signs[i]==false){
          absolutes[i]=-absolutes[i];
     }
      sum += absolutes[i];
  }
  return sum;

}
}

