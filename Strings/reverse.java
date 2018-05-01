/*
From HackerRank
Given a string A , print Yes if it is a palindrome, print No otherwise.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        StringBuilder B = new StringBuilder();
        B.append(A);
        B.reverse();
        String C = B.toString();
        if (A.equals(C)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
