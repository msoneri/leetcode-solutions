// time complexity: O(n)
// space complexity: O(1)

class Solution {
    public static int largestAltitude(int[] gain) {
        int h = 0;
        int max = 0;

        for (int i = 0; i < gain.length; i++) {
            h += gain[i];
            max = Math.max(max, h);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(String.valueOf(Solution.largestAltitude(gain)));
    }
}