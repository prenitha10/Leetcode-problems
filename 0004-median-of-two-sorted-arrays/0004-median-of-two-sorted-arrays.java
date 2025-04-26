import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n + m];        
        for (int i = 0; i < n; i++) {
            arr[i] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            arr[i + n] = nums2[i];
        }
        
        Arrays.sort(arr);
        int total = n + m;
        int mid = total / 2;
        
        if (total % 2 == 0) {
            return (arr[mid - 1] + arr[mid]) / 2.0; 
        } else {
            return arr[mid]; 
        }
    }
}
