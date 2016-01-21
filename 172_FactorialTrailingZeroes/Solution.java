// # 172 Factorial Trailing Zeroes 
//Given an integer n, return the number of trailing zeroes in n!.
//
//Note: Your solution should be in logarithmic time complexity.
//??2???5????????0??????5???????2?
//
//??? 5! =(2 * 2 * 2 * 3 * 5). ?? 0?? is 1.
//
//          11! (2 8 * 34 * 52 * 7). ?? 0?? is 2.
//
//???????????5????????25??2?5,125????????????

count= floor(n/5) + floor(n/25) + floor(n/125) + ....
public class Solution { 
    public int trailingZeroes(int n) { 
        if (n < 5) return 0; 
        int count = 0; 
        int i = 5; 
        while (n/i >= 1) 
            { 
                count = count + n/5; 
                n = n/5; 
            } 
        return count; 
    } 
}