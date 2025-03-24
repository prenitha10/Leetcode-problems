class Solution {
    public List<List<String>> groupAnagrams(String[] strs)
    {
        HashMap<String,List<String>> hmap=new HashMap<>();     
        for(String s:strs)
        {
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!hmap.containsKey(key))
            {
                hmap.put(key,new ArrayList<>());
            }
            hmap.get(key).add(s);
        } 
        return new ArrayList<>(hmap.values());  
    }
}