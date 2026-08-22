import java.io.*;
import java.util.*;

public class Solution {

    public static void matrixRotation(List<List<Integer>> a, int r) {
        int m = a.size(), n = a.get(0).size();

        for (int l = 0; l < Math.min(m, n) / 2; l++) {
            int top = l, left = l;
            int bottom = m - l - 1, right = n - l - 1;

            List<Integer> x = new ArrayList<>();

            for (int j = left; j <= right; j++) x.add(a.get(top).get(j));
            for (int i = top + 1; i <= bottom; i++) x.add(a.get(i).get(right));
            for (int j = right - 1; j >= left; j--) x.add(a.get(bottom).get(j));
            for (int i = bottom - 1; i > top; i--) x.add(a.get(i).get(left));

            int len = x.size();
            int shift = r % len;
            List<Integer> y = new ArrayList<>();

            for (int i = 0; i < len; i++)
                y.add(x.get((i + shift) % len));

            int k = 0;

            for (int j = left; j <= right; j++) a.get(top).set(j, y.get(k++));
            for (int i = top + 1; i <= bottom; i++) a.get(i).set(right, y.get(k++));
            for (int j = right - 1; j >= left; j--) a.get(bottom).set(j, y.get(k++));
            for (int i = bottom - 1; i > top; i--) a.get(i).set(left, y.get(k++));
        }

        for (List<Integer> row : a)
            System.out.println(String.join(" ", row.stream()
                    .map(String::valueOf).toArray(String[]::new)));
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++)
                row.add(sc.nextInt());
            matrix.add(row);
        }

        matrixRotation(matrix, r);
    }
}
