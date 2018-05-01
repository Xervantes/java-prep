/*
Given a string, s, and an integer, k, complete the function so that it finds
the lexicographically smallest and largest substrings of length k.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] myArray = new String[s.length() - (k-1)];
        if (k <= 0) {
            return "you are dumb";
        }
        else if (s.length() == k) {
            smallest = s;
            largest = s;
        } else {
            for (int i = 0; (i < s.length() - (k-1)); i++) {
                myArray[i] = s.substring(i, i+k);
            }
            Arrays.sort(myArray);
            smallest = myArray[0];
            largest = myArray[myArray.length-1];
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
