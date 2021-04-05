import java.lang.*;

public class StringManipulator {
    public String trimAndConcat(String word1, String word2) {
        return word1.trim() + word2.trim();
    }
    public int getIndexOrNull(String word, char letter) {
        return word.indexOf(letter);
    }
    public Integer getIndexOrNull(String word, String searchWord) {
        // return word.indexOf(searchWord);
        Integer index = word.indexOf(searchWord);
        if (index > 0) {
            return index;
        } else {
            return null;
        }
    }
    public String concatSubstring(String word, int startIdx, int endIdx, String secondString) {
        String subStr = word.substring(startIdx, endIdx);
        subStr += secondString;
        return subStr;
    }
}
