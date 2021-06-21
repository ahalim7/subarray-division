package org.halim.ps;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int possibleDivision = 0;
        for (int i = 0; i < s.size(); i++) {
            int count = 0;
            for (int j = i; j != i + m && (i + m) <= s.size(); j++) {
                count += s.get(j);
            }

            if (count == d) {
                possibleDivision++;
            }
        }
        return possibleDivision;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        int result = Result.birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2);
        System.out.println(result);
    }
}
