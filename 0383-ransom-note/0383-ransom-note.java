class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> hmap=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++)
        {
            hmap.put(ransomNote.charAt(i),hmap.getOrDefault(ransomNote.charAt(i),0)-1);
        }
        for(int i=0;i<magazine.length();i++)
        {
            hmap.put(magazine.charAt(i),hmap.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(int ele:hmap.values() )
        {
            if(ele<0 )
                return false;
        }
        return true;
        
    }
}