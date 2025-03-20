class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        List<List<Integer>> newarr=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]-arr[i]<min)
            {
                newarr.clear();
                List<Integer> inner=new ArrayList<>();
                min=arr[i+1]-arr[i];
                inner.add(arr[i]);
                inner.add(arr[i+1]);
                newarr.add(inner);
            
            }
            else if(arr[i+1]-arr[i]==min)
            {
                List<Integer> inner=new ArrayList<>();
                inner.add(arr[i]);
                inner.add(arr[i+1]);
                newarr.add(inner);
            }
        }
        
        return newarr;
    }
}