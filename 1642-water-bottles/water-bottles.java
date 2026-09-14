class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int refilled = 0;
        int leftOver= 0;
        int res = numBottles;
        while(numBottles >= numExchange){
            refilled = numBottles / numExchange;
            leftOver = numBottles % numExchange;
            res = res + refilled;
            numBottles = (leftOver + refilled);
        }
        return res;
    }
}