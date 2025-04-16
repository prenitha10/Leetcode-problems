class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int ele:arr)
        {
            hmap.put(ele,hmap.getOrDefault(ele,0)+1);
        }
        Set<Integer> s=new HashSet<>();
        for(int ele:hmap.values())
        {
            s.add(ele);
        }
        return s.size()==hmap.size();
    }
}