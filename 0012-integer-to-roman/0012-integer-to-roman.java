class Solution {
    public String intToRoman(int num) {
        int[] number={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] str={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(num>0)
        {
            if(num>=number[i])
            {
                sb.append(str[i]);
                num-=number[i];
            }
            else
                i++;
        }
        return String.valueOf(sb);
    }
}