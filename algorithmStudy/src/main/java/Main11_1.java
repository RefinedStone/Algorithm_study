class Solution11 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        int n= arr1.length;
        //System.out.println(arr1);

        int m= arr1[0].length;
        int[][] arr3= new int[n][m];


        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr3[i][j]= arr1[i][j]+arr2[i][j];
            }

        }


        // int[][] answer = {};
        //  System.out.println(arr3);
        return arr3;
    }
}