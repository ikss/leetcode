package numbers.easy

/**
 * You are given an integer n. We reorder the digits in any order (including the original order)
 * such that the leading digit is not zero.
 *
 * Return true if and only if we can do this so that the resulting number is a power of two.
 *
 * [URL](https://leetcode.com/problems/reordered-power-of-2/)
 */
object ReorderedPowerOf2 {
    fun reorderedPowerOf2(N: Int): Boolean {
        val hash = hash(N)
        for (i in 0..30) {
            if (hash.contentEquals(hash(1 shl i))) {
                return true
            }
        }
        return false
    }

    // Returns the hash of number by digits
    // e.g. N = 112223334, returns [0,2,3,3,1,0,0,0,0,0]
    private fun hash(n: Int): IntArray {
        var n = n
        val ans = IntArray(10)
        while (n > 0) {
            ans[n % 10]++
            n /= 10
        }
        return ans
    }
}
