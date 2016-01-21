// 299 Bulls and Cows
//You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to guess what the number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret number exactly in both digit and position (called "bulls") and how many digits match the secret number but locate in the wrong position (called "cows"). Your friend will use successive guesses and hints to eventually derive the secret number.
//
//For example:
//
//Secret number:  "1807"
//Friend's guess: "7810"
//Hint: 1 bull and 3 cows. (The bull is 8, the cows are 0, 1 and 7.)
//Write a function to return a hint according to the secret number and friend's guess, use A to indicate the bulls and B to indicate the cows. In the above example, your function should return "1A3B".
//
//Please note that both secret number and friend's guess may contain duplicate digits, for example:
//
//Secret number:  "1123"
//Friend's guess: "0111"
//In this case, the 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow, and your function should return "1A1B".
//You may assume that the secret number and your friend's guess only contain digits, and their lengths are always equal.
public class Solution { 
    public String getHint(String secret, String guess) { 
        if (secret == null || guess == null) { 
            return ""; 
        } 
        if (secret == guess) { 
            return "1A0B"; 
        } 
        int len = secret.length(); 
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
        int bull = 0, cow = 0; 
        for (int i = 0; i < len; i++) { 
            char c1 = secret.charAt(i); 
            char c2 = guess.charAt(i); 
            if (c1 == c2) { 
                bull++; 
            } 
            else if (map.containsKey(c1)) { 
                    map.put(c1, map.get(c1) + 1); 
                } 
            else { 
                map.put(c1, 1); 
            } 
        } 
        for (int i = 0; i < len; i++) { 
            char c1 = secret.charAt(i); 
            char c2 = guess.charAt(i); 
            if (c1 == c2) { 
                continue; 
            } 
            else { 
                if (map.containsKey(c2)) { 
                    cow++; 
                    map.put(c2, map.get(c2)-1); 
                    if (map.get(c2) == 0) { 
                        map.remove(c2); 
                    } 
                } 
            } 
        } 
        return bull + "A" + cow + "B"; 
    } 
}