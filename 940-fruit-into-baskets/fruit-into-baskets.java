class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int maxCount = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right = 0;right < fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            
            while(map.size() > 2){
                int leftNum = fruits[left];
                map.put(leftNum,map.get(leftNum)-1);
                if(map.get(leftNum) == 0){
                    map.remove(leftNum);
                }
                left++;
            }

            int length = right - left + 1;
            if(length > maxCount){
                maxCount = length;
            }
        }
        return maxCount;
    }
}
//longest subarray with at most 2 distinct elements