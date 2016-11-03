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
        LongestSubstrWithoutRepeatingCharacters l = new LongestSubstrWithoutRepeatingCharacters();
        System.out.println(l.lengthOfLongestSubstring(s));
    }
    public int lengthOfLongestSubstring(String s) {

        /*String candidate = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < candidate.length(); j++) {
                if (s.charAt(i) == candidate.charAt(j)) {
                    return Math.max(candidate.length(), lengthOfLongestSubstring(s.substring(j+1)));
                }
            }
            candidate += s.charAt(i);
        }
        return candidate.length();*/

        int result = 0;
        int start = 0;
        int end = 0;
        int cursor = 0;


        return result;
    }
}
