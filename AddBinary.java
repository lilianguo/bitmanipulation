/**
 * 67. Add Binary
 * Easy
 *
 * Given two binary strings a and b, return their sum as a binary string.
 *
 *
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 *
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 *
 *
 * Constraints:
 *
 *     1 <= a.length, b.length <= 104
 *     a and b consist only of '0' or '1' characters.
 *     Each string does not contain leading zeros except for the zero itself.
 */
class Solution {
  public String addBinary(String a, String b) {
    int carry = 0, idx1 = a.length() - 1, idx2 = b.length() - 1;
    StringBuilder sb = new StringBuilder();
    while (idx1 >= 0 || idx2 >= 0) {
      int currA = idx1 >= 0 ? a.charAt(idx1) - '0' : 0;
      int currB = idx2 >= 0 ? b.charAt(idx2) - '0' : 0;
      int tmp = carry + currB + currA;
      if (tmp % 2 == 1) {
        sb.append("1");
      } else {
        sb.append('0');
      }
      carry = tmp / 2;
      idx1--;
      idx2--;
    }
    while(carry > 0 ) {
      int rem = carry % 2;
      sb.append(rem == 1 ? '1' : '0');
      carry /= 2;
    }
    return sb.reverse().toString();
  }
}