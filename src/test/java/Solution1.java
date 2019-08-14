public class Solution1 implements Solution {
    // two pass solution
    @Override
    public void sortColors(int[] nums) {
        int nRed = 0, nWhite = 0, nBlue = 0;
        for (int i = 0; i < nums.length; i++) {
            switch(nums[i]) {
                case 0:
                    nRed++;
                    break;
                case 1:
                    nWhite++;
                    break;
                default:
                    nBlue++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nRed-- > 0) {
                nums[i] = 0;
            } else if (nWhite-- > 0) {
                nums[i] = 1;
            } else if (nBlue-- > 0) {
                nums[i] = 2;
            }
        }
    }
}
