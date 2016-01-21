// #58 Length of Last Word 
// Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
//
//If the last word does not exist, return 0.
//
//Note: A word is defined as a character sequence consists of non-space characters only.
//
//For example, 
//Given s = "Hello World",
//return 5.
// Tags: String
public class Solution { 
    public int lengthOfLastWord(String s) { 
        if (s == null) return 0; 
        String[] strs = s.split(" "); 
        if (strs.length == 0) return 0; 
        String result = strs[strs.length-1]; 
        return result.length(); 
    } 
}