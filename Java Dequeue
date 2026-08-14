import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int unique = 0, max = 0;
        for (int i = 0; i < n; i++) {
            int c = map.containsKey(a[i]) ? map.get(a[i]) : 0;
            if (i >= k) {
                int x = a[i - k];
                int old = map.get(x);
                if (old == 1) {
                    map.remove(x);
                    unique--;
                } else {
                    map.put(x, old - 1);
                }
            }
            if (c == 0)
                unique++;
            map.put(a[i], c + 1);
            if (i >= k - 1)
                max = Math.max(max, unique);
        }
        System.out.println(max);
    }
}
