import java.util.Scanner;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 * @author Ulong
 * @create 2016/10/17
 */
public class LongestSubstrWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a string:");
        String s = scanner.next();
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); i++) {
            String sub = s.substring(j, i);
            int k = sub.indexOf(s.charAt(i));
            if (k > -1) {
                j += k + 1;
            }
            max = Math.max(max, i - j + 1);
        }

        return max;
    }
}
