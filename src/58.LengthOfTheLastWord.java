class Solution {
    // Small Change
    public int lengthOfLastWord(String s) {
        int currentWordLength = 0, maxWordLength = 0;
        for (int i = 0; i< s.length(); i++){
            if(s.charAt(i)== ' '){
                if(currentWordLength != 0) {
                    maxWordLength = currentWordLength;
                }
                currentWordLength = 0;
            }
            else{
                currentWordLength++;
            }
        }
        if(currentWordLength != 0){
            maxWordLength = currentWordLength;
        }
        return maxWordLength;
    }
}