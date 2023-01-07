class Solution9 {
    public double solution(int[] arr) {
        int num = arr.length;
        int sum =0;

        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        double sum2= (double)sum/arr.length;
        return sum2;
    }
}