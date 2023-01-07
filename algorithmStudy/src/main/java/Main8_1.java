class Solution8 {
    public int solution(int[] absolutes, boolean[] signs) {
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