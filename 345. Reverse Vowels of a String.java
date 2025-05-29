class Solution {
    static boolean isVowel(char ch){
        return "AEIOUaeiou".indexOf(ch)>=0;
    }

    public String reverseVowels(String s) {
        char [] str = s.toCharArray();

        int left = 0;
        int right = s.length()-1;

        while(left<right){
            if(!isVowel(str[left])){
                left++;
            }

            else if(!isVowel(str[right])){
                right--;
            }

            else{
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
        }

        return new String(str);
        
    }
}