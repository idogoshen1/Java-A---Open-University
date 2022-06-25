/**
 * Ex14 class                                       Author:ido goshen
 * This class include the solutions of mmn 14.             Version: 12/2018
 */

import java.util.Arrays;

public class Ex14
{
    
    /**
     * Returns the number of organs in the longest slope in the two-dimensional array
     * Gets two-dimensional array and a number - requested difference,
     * and returns the number of the longest "slope" of organs in the array
     * that have this difference between each other - must be Descending
     * order.
     * slope can be organs who closed each other in the array's order
     * from "up", "down", "left", "right" (not diagonally)
     * @param mat The two-dimensional array to search in  
     * @param num The requested difference
     * @return The longest "slope" in the arrary in the requested difference 
     */
    
    public static int longestSlope (int [][] mat, int num)
    {
        int temp = longestSlope (mat, num, 0, 0);
               
        if (temp > 0)
            return 1+temp;
            
        return temp;
    }

    // checks wich organ have the maximum slope from un the array
    
    private static int longestSlope (int[][] mat, int num, int row, int col)
    {
        if (row == mat.length -1 && col == mat[0].length -1)
        return 0;
        
        if (col == mat[0].length)
        return longestSlope (mat, num, row +1 , 0);
        
        int temp1 = maxSlopeFrom (mat, num , row, col);
        int temp2 = longestSlope (mat, num , row, col+1);
        
        if (temp1 > temp2)
            return temp1;
        
        return temp2;
    }
    
    // checks the longest slope begin in a requested organ
    private static int maxSlopeFrom (int[][] mat, int num, int row, int col)
      {
          int down = 0;
          int right = 0;
          int up = 0;
          int left = 0;
      
          if (row != mat.length-1)
          {
            if (mat [row][col] - mat[row+1][col] == num)
            {
                down = 1 + maxSlopeFrom (mat, num, row+1, col);
            }
          }
            
          if (col != mat[0].length-1)
          {
              if (mat [row][col] - mat[row][col+1] == num)
              {
                    right =  1 + maxSlopeFrom (mat, num, row, col+1);
              }
          }
          
          if (row != 0)
          {
            if (mat [row][col] - mat[row-1][col] == num)
            {
                up = 1 + maxSlopeFrom (mat, num, row-1, col);
            }
          }
            
          if (col != 0)
          {
              if (mat [row][col] - mat[row][col-1] == num)
              {
                    left =  1 + maxSlopeFrom (mat, num, row, col-1);
              }
          }
      
          if (down > right && down > left && down > up)
                return down;
          if (right > left && right > up)
            return right;
          if (left > up)
            return left;
          return up;
    }

    
    /**
     * Returns the number of the option to set numbers from 1 to max number
     * in a requested long of array in a non-Descending order from left to right
     * Gets number of long of array and a  positive number maximum, and returns the number of the options to set the numbers 
     * from 1 to the maximum in an array of the requested longing in a non-Descending order from left to right
     * @param n the longing of arrary to set numbers in   
     * @param num the number to set number from 1 to it in the array
     * @return the numbers of option to set numbers drom 1 to num in non-Descending order in array in longing of num  
     */
    
    public static int howManySorted (int n, int max)
    {
        if (n == 0 || max == 0)
        return 0;
        
        if (max == 1)
        return 1;
        
        if (n == 1)
        return max;
        
        return howManySorted (n-1, max) + (howManySorted (n, max-1));
    }


}


