class Solution {
    public int maxArea(int[] height) {
      int left = 0;
      int right = height.length -1;
      int maxArea = 0;
      while(left < right){
        int waterLevel = Math.min(height[left],height[right]);
        int diff = right - left;
        int area =  diff * waterLevel;
        if(area > maxArea){
            maxArea = area;
        }
        if(waterLevel == height[left]){
            left++;
        }else{
            right--;
        }
      }
      return maxArea;
    }
}