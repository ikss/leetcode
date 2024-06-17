package numbers.medium

/**
 * Given a non-negative integer c, decide whether there are two integers a and b such that a2 + b2 = c.
 *
 * [URL](https://leetcode.com/problems/sum-of-square-numbers/)
 */
object SumOfSquareNumbers {
    fun judgeSquareSum(c: Int): Boolean {
        val top = Math.sqrt(c.toDouble()).toInt()

        for (i in 0 .. top) {
            val sqr = i * i
            val b = Math.sqrt(c.toDouble() - sqr)

            if (b == b.toInt().toDouble()) return true
        }
        return false
    }
}
