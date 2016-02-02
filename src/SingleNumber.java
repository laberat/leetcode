/**
 * Author : Laberat
 * Date   : 16/2/2.
 * Link   : https://leetcode.com/problems/single-number/
 * Number : # 136
 * Desc   : Given an array of integers, every element appears twice except for one.
 *          Find that single one.
 *          Your algorithm should have a linear runtime complexity.
 *          Could you implement it without using extra memory?
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;
    }

    public static void main() {
        int[] nums = {1,2,3,1,2,3,4};
        SingleNumber s = new SingleNumber();
        int res = s.singleNumber(nums);
        System.out.println(res);
    }
}
