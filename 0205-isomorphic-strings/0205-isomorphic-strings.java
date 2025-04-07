class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        HashMap<Character,Character> hmap=new HashMap<>();
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            char sc=s.charAt(i);
            char tc=t.charAt(i);
            if(hmap.containsKey(sc))
            {
                if(hmap.get(sc)!=tc)
                    return false;
            }
            else if(hmap.containsValue(tc))
                return false;
            hmap.put(sc,tc);
        }
       
        return true;
    }
}