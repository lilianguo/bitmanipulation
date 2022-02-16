/**
 write a function:
 function solution( A, B );
 that given two non-negative intergers A and B returns the number bits set to 1 in the binary representation of number A*B.

 For example given A = 3 and B = 7 the function should return 3 because the binary representation of A*B = 3*7 = 21 IS 10101 and
 it contains three bits set to 1.
 Assume that
 A and B are intergers within the range [ 0.... 1000,000,000 ]

 SOLUTION
 */

class Solution {
  public int numOfOne(int num1, int num2) {
    if (num1 == 0 || num2 == 0) {
      return 0;
    }
    int count = 0;
    int product = num1 * num2;
    String bin = Integer.toBinaryString(product);
    for (char c : bin.toCharArray()) {
      if (c - '1' == 0)
        count++;
    }
    return count;
  }
}