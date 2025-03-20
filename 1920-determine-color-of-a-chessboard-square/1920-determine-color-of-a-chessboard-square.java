class Solution {
    public boolean squareIsWhite(String coordinates)
    {
        char[] ch=coordinates.toCharArray();
        for(char ele:ch)
        {
            System.out.print(ele+" ");
        }
        int a=ch[0]-'0';
        int b=ch[1]-'0';
        if((a%2==0 && b%2==0)||(a%2!=0 && b%2!=0))
        {
            return false;
        }
        else
        {
            return true; 
        }    
 
    }
}