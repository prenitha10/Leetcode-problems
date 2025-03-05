class Solution {
    public int diagonalSum(int[][] mat) {
        int matlen =mat.length;
        int sum=0;
        for(int i=0;i<matlen;i++)
        {
            for(int j=0;j<matlen;j++)
            {
                if(i==j)
                    sum+=mat[i][j];
                else if(i+j==matlen-1 && i!=j)
                    sum+=mat[i][j];
            }
        }
        return sum;
    }
}