class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr=new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        int top=0,left=0,right=col-1,bottom=row-1;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                arr.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                arr.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        return arr;
    }
}