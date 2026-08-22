import java.util.Arrays;

public class Main {

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        int index = 0;

        for (int i = 0; i < n; i++) {
            ans[index++] = nums[i];       // x[i]
            ans[index++] = nums[i + n];   // y[i]
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] result = shuffle(nums, n);

        System.out.println(Arrays.toString(result));
    }
}
