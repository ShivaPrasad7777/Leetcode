class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int idx = 0;
        int res[] = new int[friends.length];
        for(int i=0;i<order.length;i++){
            for(int j=0;j<friends.length;j++){
                if(order[i] == friends[j]){
                    res[idx] = order[i];
                    idx++;
                }
            }
        }
        return res;
    }
}