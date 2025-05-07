class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character,Integer> hmap=new HashMap<>();
        int max=-1;
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(hmap.containsKey(ch[i]))
            {
                max=Math.max(max,i - hmap.get(ch[i]) - 1);
            }
            else
                hmap.put(ch[i],i);
        }
        return max;
    }
}