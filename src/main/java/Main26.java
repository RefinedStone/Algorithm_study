public class Main26 {
    public static void main(String[] args) {

       long n = 147*147;
        double rootCheck = Math.sqrt(n);
        if(Math.ceil(rootCheck) == Math.floor(rootCheck)){
            rootCheck =(rootCheck+1)*(rootCheck+1);
        }
        else{
            rootCheck = -1;
        }
       // return (long)rootCheck;
        //System.out.println((int)rootCheck);


    }
}
