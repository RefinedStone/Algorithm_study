public class Main1{
    public static void main(String[] args) {
    int n =125;
    StringBuilder s = new StringBuilder();
    n=Integer.parseInt(s.append(Integer.toString(n,3)).reverse().toString(),3);
      //  return n;
        System.out.println(n);
    }
}