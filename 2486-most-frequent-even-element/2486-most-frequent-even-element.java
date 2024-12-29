class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                hmap.put(nums[i], hmap.getOrDefault(nums[i], 0) + 1);
            }
        }

        int maxKey = -1;
        int maxVal = -1;

        List<Integer> list = new ArrayList<>(hmap.keySet());

        Collections.sort(list, Collections.reverseOrder());

        for (int ele : list) {
            int val = hmap.get(ele);
            if (maxKey <= val) {
                maxVal = ele;
                maxKey = val;
            }
        }

        return maxVal;
    }
}