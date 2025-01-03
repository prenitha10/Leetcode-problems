class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0,res,cur,target,candidates);
        return res;        
    }
    public void backtrack(int start,List<List<Integer>> res,List<Integer> cur,int target,int[] candidates)
    {
        if(target<0)
            return;
        if(target==0)
        {
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=start;i<candidates.length;i++)
        {
            if(i>start && candidates[i]==candidates[i-1])
                continue;
            cur.add(candidates[i]);
            backtrack(i+1,res,cur,target-candidates[i],candidates);
            cur.remove(cur.size()-1);
        }
    }
}