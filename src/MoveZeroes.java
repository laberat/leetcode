/**
 * Author : Laberat
 * Date   : 16/2/3.
 * Link   : https://leetcode.com/problems/move-zeroes/
 * Number : # 283
 * Desc   : Given an array nums, write a function to move all 0's to the end of it
 *          while maintaining the relative order of the non-zero elements.
 *          You must do this in-place without making a copy of the array.
 *          Minimize the total number of operations.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0;i < nums.length;i ++) {
            if (nums[i] == 0) {
                count ++;
            } else {
                nums[i - count] = nums[i];
            }
        }
        for (int i = nums.length - count;i < nums.length;i ++) {
            nums[i] = 0;
        }
    }
}
