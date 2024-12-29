class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        Map<Character,Integer> hmap=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hmap.put(s.charAt(i),hmap.getOrDefault(s.charAt(i),0)+1);
            hmap.put(t.charAt(i),hmap.getOrDefault(t.charAt(i),0)-1);            
        }
        for(int val:hmap.values())
        {
            if(val!=0)
            {
                return false;
            }
        }
        return true;
    }
}