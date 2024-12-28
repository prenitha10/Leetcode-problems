class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max=0;
        int PrevVal=values[0]+0;
        int n=values.length;
        for(int i=1;i<n;i++)
        {   
            if(PrevVal+values[i]-i>max)
            {
                max=PrevVal+values[i]-i;
            }
            if(values[i]+i>PrevVal)
            {
                PrevVal=values[i]+i;
            }
        }  
        return max;      
    }
}