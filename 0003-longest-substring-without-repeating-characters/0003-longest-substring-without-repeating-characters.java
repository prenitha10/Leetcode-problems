class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hset=new HashSet<>();
        int l=0;
        int max=0;
        for(int r=0;r<s.length();r++)
        {
            while(hset.contains(s.charAt(r)))
            {
                hset.remove(s.charAt(l));
                l++;
            }
            hset.add(s.charAt(r));
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}