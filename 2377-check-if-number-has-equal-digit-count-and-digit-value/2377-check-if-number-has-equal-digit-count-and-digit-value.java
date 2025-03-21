class Solution {
    public boolean digitCount(String num) {
        int[] count=new int[10];
        //frequency
        for(char ch:num.toCharArray())
        {
            count[ch-'0']++;
        }
        for(int i=0;i<num.length();i++)
        {
            //need to put '0' to change to int value
            if(num.charAt(i)-'0'!=count[i])
                return false;
        }
        return true;
    }
}