class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> newarr = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int ele : nums1) 
        {
            set1.add(ele);
        }

        for (int ele : nums2) 
        {
            set2.add(ele);
        }

        List<Integer> arr1 = new ArrayList<>();
        for (int num : set1) 
        {
            if (!set2.contains(num)) 
            {
                arr1.add(num);
            }
        }

        List<Integer> arr2 = new ArrayList<>();
        for (int num : set2) 
        {
            if (!set1.contains(num)) 
            {
                arr2.add(num);
            }
        }

        newarr.add(arr1);
        newarr.add(arr2);
        return newarr;
    }
}
