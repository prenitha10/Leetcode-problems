class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(int i=0;i<word1.length();i++)
        {
            hmap.put(word1.charAt(i),hmap.getOrDefault(word1.charAt(i),0)+1);
            hmap.put(word2.charAt(i),hmap.getOrDefault(word2.charAt(i),0)-1);
        }
        for(int ele:hmap.values())
        {
            if(ele>=4||ele<=-4)
                return false;
        }
        return true;
        
    }
}