// time complexity: O(3^n * 4^m)
// n: number count with 3 letters
// m: number count with 4 letters

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return new ArrayList<>();
        
        HashMap<Character, String> letterMap = new HashMap<>();
        letterMap.put('2', "abc");
        letterMap.put('3', "def");
        letterMap.put('4', "ghi");
        letterMap.put('5', "jkl");
        letterMap.put('6', "mno");
        letterMap.put('7', "pqrs");
        letterMap.put('8', "tuv");
        letterMap.put('9', "wxyz");

        char[] dig = digits.toCharArray();

        List<String> cList = 
            new ArrayList<>(Arrays.asList(letterMap.get(dig[0]).split("")));

        for (int i = 1; i < dig.length; i++) {
            cList = Solution.cartesianProduct(cList, letterMap.get(dig[i]).toCharArray());
        }

        return cList;
    }

    private static List<String> cartesianProduct(List<String> a, char[] b) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.length; j++) {
                list.add(a.get(i) + b[j]);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        String digits = "234";

        System.out.println(letterCombinations(digits).toString());
    }
}
