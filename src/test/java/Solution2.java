
public class Solution2 implements Solution {
    // one pass solution
    @Override
    public void sortColors(int[] nums) {
        int currColor = 0;
        for (int i = 0; i < nums.length; ) {
            if (nums[i] != currColor) {
                int j = i+1;
                while (j < nums.length && nums[j] != currColor) {
                    j++;
                }
                if (j == nums.length) {
                    currColor++;
                } else {
                    swap(nums, i, j);
                    i++;
                }
            } else {
                i++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
