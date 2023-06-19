// time complexity: O(n)
// space complexity: O(1) 

class Solution {
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int i = 0;
        int j = len - 1;
        int swap;

        while (i < j) {
            if (nums[i] == val) {
                // swap func
                swap = nums[i];
                nums[i] = nums[j];
                nums[j] = swap;
                i--;
                j--;
            }

            i++;
        }

        for (i = 0; i < len; i++) {
            if (nums[i] == val) {
                break;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int k = Solution.removeElement(nums, val);
        System.out.println(String.valueOf(k));
    }
}