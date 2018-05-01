/*
From HackerRank
Given a string, s, split the string into tokens.
We define a token to be one or more consecutive English alphabetic letters.
Then, print the number of tokens, followed by each token on a new line.
*/

import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        } else if (s.length() > 400000) {
            return;
        } else {
            String[] strArray = s.split("[ !,?._'@]+", 0);
            System.out.println(strArray.length);
            for (int i = 0; i < strArray.length; i++) {
                System.out.println(strArray[i]);
            }
        }
        scan.close();
    }
}
