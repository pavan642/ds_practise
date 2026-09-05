import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> findTriplets(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        // Base case check: at least 3 elements required
        if (nums == null || nums.length < 3) {
            return result;
        }

        // Step 1: Sort the array to use the two-pointer approach
        Arrays.sort(nums);

        // Step 2: Iterate through the array fixing the first element
        for (int i = 0; i < nums.length - 2; i++) {

            // Optimization: Skip duplicate values for the first element to ensure distinct triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Step 3: Initialize the two pointers for the remaining subarray
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (currentSum == target) {
                    // Found a valid distinct triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for the left pointer
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicates for the right pointer
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move both pointers inward after finding a match
                    left++;
                    right--;

                } else if (currentSum < target) {
                    // Sum is too small, move left pointer to increase it
                    left++;
                } else {
                    // Sum is too large, move right pointer to decrease it
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums = {2,3,4,5,20,22};
        int target = 28;

        List<List<Integer>> triplets = findTriplets(nums, target);
        System.out.println("Distinct Triplets: " + triplets);
        // Output: [[-1, -1, 2], [-1, 0, 1]]
    }
}
