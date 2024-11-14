class Solution {
    public void sortColors(int[] nums) {
        int left = 0, right = 0, n = nums.length;
        for(int num : nums) {
            if(num == 0) left++;
            else if(num == 1) right++;
        }  

        for(int i = 0; i < left; i++) {
            nums[i] = 0;
        }

        for(int i = left; i < left + right; i++) {
            nums[i] = 1;
        }

        for(int i = left + right; i < n; i++) {
            nums[i] = 2;
        }
    }
}