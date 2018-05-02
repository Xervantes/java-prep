/*
The first line has an integer n. In each of the next n lines there will be an integer d
denoting number of integers on that line and then there will be d space-separated integers.
In the next line there will be an integer q denoting number of queries.
Each query will consist of two integers x and y.

E.X. ( n=5, d=5,1,4,0,3, q=5, (x,y)=(1,3) )

Sample Input:
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLines = sc.nextInt();
        ArrayList[] table = new ArrayList[numLines];
        for (int i = 0; i < numLines; i++) {
            int numInts = sc.nextInt();
            table[i] = new ArrayList();
            for (int j = 0; j < numInts; j++) {
                table[i].add(sc.nextInt());
            }
        }
        int numQueries = sc.nextInt();
        for (int k = 0; k < numQueries; k++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(table[x-1].get(y-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
