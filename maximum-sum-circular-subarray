import java.util.*;

public class Solution {

    static int[] maxSubarray(int[] a) {
        int cur = a[0], sub = a[0], seq = Math.max(0, a[0]);

        for (int i = 1; i < a.length; i++) {
            cur = Math.max(a[i], cur + a[i]);
            sub = Math.max(sub, cur);
            seq += Math.max(0, a[i]);
        }

        if (seq == 0)
            seq = Arrays.stream(a).max().getAsInt();

        return new int[]{sub, seq};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            int[] ans = maxSubarray(a);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
