// #33 Search in Rotated Sorted Array 
// Suppose a sorted array is rotated at some pivot unknown to you beforehand.
// (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
// You are given a target value to search. If found in the array return its index, otherwise return -1.
// You may assume no duplicate exists in the array.
// Tags: Array, Binary Search

public class Solution { 
    public int search(int[] A, int target) { 
        int lo = 0; 
        int hi = A.length - 1; 
         
        while (lo <= hi) 
        { 
            int mid = lo + (hi - lo) / 2; 
             
            if (A[mid] > target) 
            { 
                if (A[mid] >= A[lo] && A[lo] > target) lo = mid + 1; 
                else hi = mid - 1; 
            } 
            else if (A[mid] < target) 
            { 
                if (A[mid] <= A[hi] && A[hi] < target) hi = mid - 1; 
                else lo = mid + 1; 
            } 
            else return mid; 
        } 
        return -1; 
    } 
}