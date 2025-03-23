class Solution {
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> res = new ArrayList<>();
        permutation(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void permutation(int[] nums, int index, List<Integer> list, List<List<Integer>> res){
        if(index >= nums.length){
            res.add(list);
            return;
        }

        for(int i = index; i < nums.length; i++){
            swap(nums, index, i);
            List<Integer> l = new ArrayList<>(list);
            l.add(nums[index]);
            permutation(nums, index + 1, l, res);
            swap(nums, i, index);
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}