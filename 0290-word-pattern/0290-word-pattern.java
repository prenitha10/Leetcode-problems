class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        Map<Character,String> hmap=new HashMap<>();
        String[] total=s.split(" ");
        if(pattern.length()!=total.length)
            return false;
        for(int i=0;i<pattern.length();i++)
        {
            char pt=pattern.charAt(i);
            String st=total[i];
            if(hmap.containsKey(pt))
            {
                if(!hmap.get(pt).equals(st))
                    return false;
            }
            else 
            {
                if(hmap.containsValue(st))
                    return false;
            }
            hmap.put(pt,st);
        }
        return true;
        
    }
}