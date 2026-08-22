import java.io.*;
import java.util.*;

public class Solution {

    public static String twoStrings(String s1, String s2) {
        boolean[] letters = new boolean[26];

        // Store characters present in s1
        for (char c : s1.toCharArray()) {
            letters[c - 'a'] = true;
        }

        // Check if any character of s2 exists in s1
        for (char c : s2.toCharArray()) {
            if (letters[c - 'a']) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < q; i++) {
            String s1 = br.readLine().trim();
            String s2 = br.readLine().trim();

            System.out.println(twoStrings(s1, s2));
        }
    }
}
