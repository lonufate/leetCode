import org.junit.Test;

import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by Ulong on 2016/11/3.
 */
public class LongestSubstrWithoutRepeatingCharactersTest {
    @Test
    public void lengthOfLongestSubstring() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a string:");
        String s = scanner.next();
        LongestSubstrWithoutRepeatingCharacters l = new LongestSubstrWithoutRepeatingCharacters();
        System.out.println(l.lengthOfLongestSubstring(s));
    }

}