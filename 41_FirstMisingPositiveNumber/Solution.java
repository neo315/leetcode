// #41 First Missing Positive 
//// Given an unsorted integer array, find the first missing positive integer.
//
//For example,
//Given [1,2,0] return 3,
//and [3,4,-1,1] return 2.
//
//Your algorithm should run in O(n) time and uses constant space.
// Tags: Array, Busket sort
//
//?????????????????????????A[i]!= i?????A[i]?A[A[i]]????????????????? A[i]== A[A[i]]?
//??i -> 0 ?n???????
//    ???????????????????????????????????A[i] = i????????????????A[0]????0??????????????A = {1}??????A[0] = 0?????????1????????????????A[i]= i+1.
//?????????Line 7, 9, 11, 12, 16, 17???????????????
//???????????Line18?????????????????????????n+1.???????

public class Solution { 
    public int firstMissingPositive(int[] A) { 
        if (A.length == 0) return 1; 
         
        int n = A.length; 
 
        for (int i = 0; i < n; i++) 
        { 
            while (A[i] != i + 1) 
            { 
                if (A[i] <= 0 || A[i] > n || A[i] == A[A[i] - 1]) break; 
                int temp = A[i]; 
                A[i] = A[temp-1]; 
                A[temp-1] = temp; 
            } 
         } 
     
    for (int i = 0; i < n; i++) 
        if (A[i] != i + 1) return i + 1; 
         
        return n + 1; 
    } 
}