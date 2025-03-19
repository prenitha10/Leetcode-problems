class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Arrays.sort(arr);
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hmap.put(arr[i],hmap.getOrDefault(arr[i],0)+1);
        }
        int count=0;
        ArrayList<Integer> newarr=new ArrayList<>();
        for(HashMap.Entry<Integer,Integer> entry:hmap.entrySet())
        {
            newarr.add(entry.getValue());
        }
        Collections.sort(newarr);
        for(int ele:newarr)
        {
            if(ele<=k)
            {
                k-=ele;
            }
            else
            {
                count++;
            }

        }
        return count;
        
    }
}