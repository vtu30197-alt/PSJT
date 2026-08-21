import java.util.*;

public class Solution {

    public static boolean halvesAreAlike(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n / 2; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        for (int i = n / 2; i < n; i++) {
            if (isVowel(s.charAt(i))) {
                count--;
            }
        }

        return count == 0;
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(halvesAreAlike(s));

        sc.close();
    }
}
