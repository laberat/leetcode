/**
 * Author : Laberat
 * Date   : 16/2/2.
 * Link   : https://leetcode.com/problems/nim-game/
 * Number : # 292
 * Desc   : each time one of you take turns to remove 1 to 3 stones.
 *          The one who removes the last stone will be the winner.
 *          You will take the first turn to remove the stones.
 *          Both of you are very clever and have optimal strategies for the game.
 *          Write a function to determine whether you can win the game given the number of stones in the heap.
 */
public class NimGame {
    public class Solution {
        public boolean canWinNim(int n) {
            if (n > 3 && n % 4 == 0) return false;
            return true;
        }
    }
}
