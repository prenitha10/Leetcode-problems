class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hmap=new HashMap<>();
        if(s.length()!=t.length())
            return false;
        for (int i=0;i<s.length();i++)
        {
            hmap.put(s.charAt(i),hmap.getOrDefault(s.charAt(i),0)+1);
            hmap.put(t.charAt(i),hmap.getOrDefault(t.charAt(i),0)-1);
        }
        for(int ele:hmap.values())
        {
            if(ele!=0)
                return false;
        }
        return true;
    }
}