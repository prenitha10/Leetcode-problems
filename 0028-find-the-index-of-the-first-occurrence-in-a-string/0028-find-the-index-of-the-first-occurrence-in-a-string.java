class Solution {
    public int strStr(String haystack, String needle) 
    {        
        for(int i=0;i<haystack.length();i++)
        {
            int count=0;
            int j=0;
            int k=i;
            while(haystack.charAt(k)==needle.charAt(j))
            {
                count++;
                j++;
                k++;                
                if(count==needle.length())
                {
                    return i;
                }             
            } 
                           
        }
        return -1;
    }    
}