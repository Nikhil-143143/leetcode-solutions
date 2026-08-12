class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder rev = new StringBuilder(s);
        rev.reverse();
        for(int i = 0; i< s.length(); i++){
            StringBuilder word = new StringBuilder();
            while(i<s.length() && rev.charAt(i) != ' '){
                word.append(rev.charAt(i));
                i++;
            }
            word.reverse();
            if(ans.length() > 0 && word.length() != 0){
                ans.append(' ');
            }
            ans.append(word);
        }
        return ans.toString();
    }
}

// eulb si yks eht