class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int maxArea = 0;
        int right = height.length - 1;
        while(left < right){
            int area = 0;
            int waterLevel = Math.min(height[left],height[right]);
            int width = right - left ;
            area = width * waterLevel;
            if(area > maxArea){
                maxArea = area;
            }
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
            
        }
  
        return maxArea;
    }
}