/**
 * Author : Laberat
 * Date   : 16/2/2.
 * Link   : https://leetcode.com/problems/add-digits/
 * Number : # 258
 * Desc   : Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 *          Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 *          Could you do it without any loop/recursion in O(1) runtime?
 *
 * Refer  : https://en.wikipedia.org/wiki/Congruence_relation
 */
public class AddDigits {
    public int addDigits(int num) {
        if (num <= 9) return num;
        if (num % 9 != 0) return num % 9;
        return 9;
    }
}
