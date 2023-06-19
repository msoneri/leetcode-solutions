// time complexity: O(n)

class Solution {
    public static boolean isPalindrome(String s) {
        String res = s.toLowerCase();

        int i = 0;
        int j = res.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            Character c = res.charAt(i);
            Character k = res.charAt(j);
            
            if (!(Character.isLetter(c) || Character.isDigit(c))) {
                i++;
                continue;
            }

            if (!(Character.isLetter(k) || Character.isDigit(k))) {
                j--;
                continue;
            }

            if (c != k) {
                isPalindrome = false;
                break;
            }

            i++;
            j--;
        }

        return isPalindrome;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(String.valueOf(Solution.isPalindrome(s)));
    }
}