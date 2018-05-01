/*
From HackerRank
Output two lines. The first line should contain a+b,
and the second line should contain a*b.
Don't print any leading zeros.
*/

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        BigInteger a = new BigInteger(A);
        BigInteger b = new BigInteger(B);
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

    }
}
