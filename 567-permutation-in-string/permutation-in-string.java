class Solution {
    public boolean checkInclusion(String str, String k) {
        HashMap<Character,Integer> strMap =  new HashMap<>();
        HashMap<Character,Integer> winMap =  new HashMap<>();
        int left = 0;
        boolean res = false;
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            strMap.put(ch,strMap.getOrDefault(ch,0)+1);
        }
        for(int right = 0;right<k.length();right++){
            char ch = k.charAt(right);
            winMap.put(ch,winMap.getOrDefault(ch,0)+1);
            if(right - left + 1 == str.length()){
                if(winMap.equals(strMap)){
                    res = true;
                }
                char leftCh = k.charAt(left);
                winMap.put(leftCh,winMap.get(leftCh)-1);
                if(winMap.get(leftCh) == 0){
                    winMap.remove(leftCh);
                }
                left++;
            }
        }
        return res;
    }
}