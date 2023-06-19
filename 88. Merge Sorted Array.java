// O(m+n)log(m+n) solution (due to Arrays.sort)
// todo: implement O(m+n) solution

// space complexity O(1) (in-place)

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i <= n-1; i++) {
            nums1[m+i] = nums2[i];
            // System.out.println(String.valueOf(nums2[i]));
        }

        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        // int[] nums1 = {1,2,3,0,0,0};
        // int[] nums2 = {2,5,6};
        int[] nums1 = {1};
        int[] nums2 = {};

        Solution solution = new Solution();
        solution.merge(nums1, 1, nums2, 0);
        for (int i = 0; i < nums1.length; i++) {
           System.out.println(String.valueOf(nums1[i]));
        }   
    }
}