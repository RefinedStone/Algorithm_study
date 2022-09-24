import java.util.Arrays;
//정확도까진 풀었으나 속도면에서 ok가 안떨어져서 이리저리 해보다가 코드가 오히려 더 망가진상황

public class Main21 {
    public static void main(String arr[]){

        String[] participant =new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"eden", "kiki"};
        Arrays.sort(participant);
        Arrays.sort(completion);
        int c_leng= completion.length;
        int p_leng = c_leng+1;

        int[] a = new int[p_leng];
        int k =0;
        int fastNum=0;

        for(int j=0; j< c_leng; j++){
            if(fastNum ==c_leng){
                break;
            }
          for(int i=0; i< p_leng; i++){

                // 불일치하면
               if((participant[i].equals(completion[j]))){
                   a[i]=1;
                   completion[j]="";
                   k++;
                   fastNum++;
                   break;
               }

            }
         }
        String data = "";
        for(int i=0; i<k; i++) {
            // 불참 ==0인 인원 체크
            if (a[i] == 0) {

                data = participant[i];
                break;
            }
        }
       // return data;
        }

    }



