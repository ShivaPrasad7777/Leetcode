class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int maxLength = Integer.MIN_VALUE;
        int left = 0;
        int zeroes = 0;
        for(int right = 0;right < arr.length;right++){
          if(arr[right] == 0){
            zeroes++;
          }
          while(zeroes > 0){
            if(arr[left] == 0){
                zeroes--;
            }
            left++;
          }
          int length = right - left+1;
          if(length > maxLength){
            maxLength = length;
          }

        }
        return maxLength;
        
    }
}