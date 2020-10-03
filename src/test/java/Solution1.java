// public class Solution1 implements Solution {
//     // two pass solution
//     @Override
//     public void sortColors(int[] nums) {
//         int nRed = 0, nWhite = 0, nBlue = 0;
//         for (int i = 0; i < nums.length; i++) {
//             switch(nums[i]) {
//                 case 0:
//                     nRed++;
//                     break;
//                 case 1:
//                     nWhite++;
//                     break;
//                 default:
//                     nBlue++;
//             }
//         }

//         for (int i = 0; i < nums.length; i++) {
//             if (nRed-- > 0) {
//                 nums[i] = 0;
//             } else if (nWhite-- > 0) {
//                 nums[i] = 1;
//             } else if (nBlue-- > 0) {
//                 nums[i] = 2;
//             }
//         }
//     }
// }
class Solution {
    public void sortColors(int[] nums) {
       int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            // if(nums[mid]==2){
            else{
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                // mid++;
                high--;
            }
        }
        
    }
}
