class Solution {
    public boolean squareIsWhite(String coordinates)
    {
        char[] ch=coordinates.toCharArray();
        for(char ele:ch)
        {
            System.out.print(ele+" ");
        }
        if((ch[0]%2==0 && ch[1]%2==0)||(ch[0]%2!=0 && ch[1]%2!=0))
        {
            return false;
        }
        else
        {
            return true; 
        }    
 
    }
}