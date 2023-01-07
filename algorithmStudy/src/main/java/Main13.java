public class Main13 {
    public static void main(String arr[]){
        int price = 3;
        int money = 20;
        int count =  4;
        int myMoney=0;
        long spend;
        long result;
        spend = ((long)price*(long)count*(count+1))/2;
        result = spend - money;
        if (result<0){
            result = 0;
        }

           // return result;
    }
}
