// #63 Unique Path II
// Follow up for "Unique Paths":
//
//Now consider if some obstacles are added to the grids. How many unique paths would there be?
//
//An obstacle and empty space is marked as 1 and 0 respectively in the grid.
//
//For example,
//There is one obstacle in the middle of a 3x3 grid as illustrated below.
//
//[
//  [0,0,0],
//  [0,1,0],
//  [0,0,0]
//]
//The total number of unique paths is 2.
//
//Note: m and n will be at most 100.
// Tags: Array Dynamic Programming

public class Solution { 
    public int uniquePathsWithObstacles(int[][] obstacleGrid) { 
        int m = obstacleGrid.length; 
        int n = obstacleGrid[0].length; 
        
        if (m == 0 || n == 0) return 0; 
        if (obstacleGrid[0][0] == 1) return 0; 
 
        int[] path = new int[n]; 
        path[0] = 1; 
        
        for (int j = 1; j < n; j++) 
        { 
            if (obstacleGrid[0][j] == 1) path[j] = 0; 
            else path[j] = path[j - 1]; 
        } 
         
       for (int i = 1; i < m; i++) 
       { 
           if (obstacleGrid[i][0] == 1) path[0] = 0; 
           for (int j = 1; j < n; j++) 
           { 
               if (obstacleGrid[i][j] == 1) path[j] = 0; 
               else path[j] = path[j] + path[j - 1]; 
           } 
       } 
     
        return path[n - 1]; 
    } 
}
