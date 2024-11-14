class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int n=nums.length;
        // check if the array is sorted(ascending order)
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
        }
        // check if the last elelment is greater than first
        if (nums[n - 1] > nums[0]){
            count++;
        } 
        // if count <=1 return true;
        return count <=1;
    }
}