class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int remaining = 0;
        boolean found = false;
        for(int i=0;i<prices.length;i++){
            if((i+1 < prices.length) && ((prices[i]+prices[i+1]) <= money)){
                remaining = money - (prices[i]+prices[i+1]);
                found = true;
                break;
            }
          
        }
        if(!found){
            return money;
        }else{
            return remaining;
        }
    }
}