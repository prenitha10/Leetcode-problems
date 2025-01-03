class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        backtrack(0,curr,res,target,candidates);
        return res;        
    }
    public void backtrack(int start,List<Integer> curr,List<List<Integer>> res,int target,int[] candidates)
    {
        if(target<0)
            return;
        if(target==0)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start;i<candidates.length;i++)
        {
            curr.add(candidates[i]);
            backtrack(i,curr,res,target-candidates[i],candidates);
            curr.remove(curr.size()-1);
        }
    }
}