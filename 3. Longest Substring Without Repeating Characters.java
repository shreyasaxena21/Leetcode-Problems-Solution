class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        for(int right = 0; right<s.length(); right++){
            while(set.contains(s.charAt(right))){
                //remove the left most
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}