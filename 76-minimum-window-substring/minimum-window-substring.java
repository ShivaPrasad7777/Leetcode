class Solution {

    public String minWindow(String s, String t) {

        if (t.length() > s.length()) {
            return "";
        }

        HashMap<Character, Integer> tMap = new HashMap<>();

        // Store required character frequencies
        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> windowMap = new HashMap<>();

        int left = 0;

        int minLength = Integer.MAX_VALUE;

        int start = 0;

        int required = tMap.size();

        int formed = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);

            // Check whether this character has satisfied
            // the required frequency
            if (tMap.containsKey(ch)
                    && windowMap.get(ch).intValue() == tMap.get(ch).intValue()) {

                formed++;
            }

            // Window is valid
            while (formed == required) {

                int length = right - left + 1;

                // Update minimum
                if (length < minLength) {

                    minLength = length;

                    start = left;
                }

                // Remove left character
                char leftChar = s.charAt(left);

                windowMap.put(leftChar, windowMap.get(leftChar) - 1);

                // If removing this character makes
                // the window invalid
                if (tMap.containsKey(leftChar)
                        && windowMap.get(leftChar) < tMap.get(leftChar)) {

                    formed--;
                }

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }
}