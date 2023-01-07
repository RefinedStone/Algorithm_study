public class Main10 {
public static void main(String arr[]){
    String phone_number ="1234567899";
    int temp = phone_number.length() - 4;
    char[] tempNum = phone_number.toCharArray();
    for(int i=0; i<temp; i++){
        tempNum[i] = '*';
        //System.out.println(tempNum[i]);
    }
    String give_num = new String(tempNum);
    //System.out.println(give_num);
    //return give_num;

}
}
