package numbers.easy

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * [URL](https://leetcode.com/problems/climbing-stairs/)
 */
object Maximum69Number {
    fun maximum69Number(num: Int): Int {
        return num.toString().replaceFirst('6', '9').toInt()
    }
}
