package numbers.medium

/**
 * Given an integer n, return all the numbers in the range `[1, n]` sorted in lexicographical order.
 *
 * You must write an algorithm that runs in O(n) time and uses O(1) extra space.
 *
 * [URL](https://leetcode.com/problems/lexicographical-numbers/)
 */
object LexicographicalNumbers {
    fun lexicalOrder(n: Int): List<Int> {
        val result = ArrayList<Int>(n)

        for (i in 1..9) {
            recursive(i, n, result)
        }
        return result
    }

    private fun recursive(num: Int, n: Int, res: ArrayList<Int>) {
        if (num > n) return
        res.add(num)
        for (i in 0..9) {
            recursive(num * 10 + i, n, res)
        }
    }
}
