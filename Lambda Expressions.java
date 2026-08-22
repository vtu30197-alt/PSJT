import java.io.*;
import java.util.*;

interface PerformOperation { boolean check(int a); }

class MyMath {
    public static boolean checker(PerformOperation p, int num) { return p.check(num); }
    public PerformOperation isOdd() { return n -> n % 2 != 0; }
    public PerformOperation isPrime() { return n -> n > 1 && java.util.stream.IntStream.rangeClosed(2, (int)Math.sqrt(n)).noneMatch(i -> n % i == 0); }
    public PerformOperation isPalindrome() { return n -> Integer.toString(n).equals(new StringBuilder(Integer.toString(n)).reverse().toString()); }
}

public class Main {
    public static void main(String[] args) throws Exception {
        MyMath ob = new MyMath();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int ch = sc.nextInt(), num = sc.nextInt();
            if (ch == 1) System.out.println(ob.checker(ob.isOdd(), num) ? "ODD" : "EVEN");
            if (ch == 2) System.out.println(ob.checker(ob.isPrime(), num) ? "PRIME" : "COMPOSITE");
            if (ch == 3) System.out.println(ob.checker(ob.isPalindrome(), num) ? "PALINDROME" : "NOT PALINDROME");
        }
    }
}
