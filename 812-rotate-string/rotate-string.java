class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String doubled = goal + goal;
        if(doubled.contains(s)){
            return true;
        }
        return false;
    }
}