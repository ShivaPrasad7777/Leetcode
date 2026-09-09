class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        HashMap<Character,Integer> pMap = new HashMap<>();
        for(int i=0;i<p.length();i++){
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i),0)+1);
        }
        HashMap<Character,Integer> winMap = new HashMap<>();
        for(int right = 0;right < s.length();right++){
            char ch = s.charAt(right);
            winMap.put(ch,winMap.getOrDefault(ch,0)+1);
            if(right - left + 1 == p.length()){
                if(winMap.equals(pMap)){
                    list.add(left);
                }
                winMap.put(s.charAt(left), winMap.get(s.charAt(left))-1);
                   if (winMap.get(s.charAt(left)) == 0) {
                    winMap.remove(s.charAt(left));
                }
                left++;
            }
        }
        return list;
    }
}