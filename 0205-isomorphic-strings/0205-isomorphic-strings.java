class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        LinkedHashMap<Character,Integer> hmap=new LinkedHashMap<>();
        LinkedHashMap<Character,Integer> hmap2=new LinkedHashMap<>();
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            if(!hmap.containsKey(s.charAt(i)))
                hmap.put(s.charAt(i),i);
            if(!hmap2.containsKey(t.charAt(i)))
                hmap2.put(t.charAt(i),i);
        }
        for(int i=0;i<s.length();i++)
        {
            if(!hmap.get(s.charAt(i)).equals(hmap2.get(t.charAt(i))))
                return false;
        }
        return true;
    }
}