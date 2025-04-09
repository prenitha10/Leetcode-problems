class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hmap=new HashMap<>();
        for(String ele:strs)
        {
            char[] ch=ele.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!hmap.containsKey(key))
            {
                hmap.put(key,new ArrayList<>());
            }
            hmap.get(key).add(ele);
        }
        return new ArrayList<>(hmap.values());
    }
}