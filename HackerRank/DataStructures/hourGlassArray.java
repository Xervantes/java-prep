/* E.X.
        1 1 1 0 0 0
        0 1 0 0 0 0
        1 1 1 0 0 0
In this problem you have to print the largest sum among all the hourglasses in the array.
There will be exactly 6 lines, each containing 6 integers seperated by spaces.
Each integer will be between 9 and -9 inclusive.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int total = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
                if (i >= 2 && j >= 2) {
                    total = arr[i-2][j-2] + arr[i-2][j-1] + arr[i-2][j]
                                          + arr[i-1][j-1]
                          + arr[i][j-2]   + arr[i][j-1]   + arr[i][j];
                }
                if (total > max) {
                    max = total;
                }
            }
        }
        System.out.println(max);
    }
}
