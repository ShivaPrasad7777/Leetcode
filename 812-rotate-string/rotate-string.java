class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            sb.deleteCharAt(0);
            if((sb.toString()).equals(goal)){
                return true;
            }
        }
        // String doubled = goal + goal;
        // if(doubled.contains(s)){
        //     return true;
        // }
        return false;
    }
}