class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(num == target){
                return i;
            }else if(i-1 >= 0 && num > target && nums[i-1] < target){
                return i;
            }
        }
        if(target < nums[0]){
            return 0;
        }else{
            return nums.length;
        }
    }
}