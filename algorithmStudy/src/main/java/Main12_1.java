class Solution12 {
    public long[] solution(int x, int n) {

        long[] intArray = new long[n];
        for(int i=0; i<n;i++){
            intArray[i]= x*(i+1);
        }

        return intArray;
    }
}