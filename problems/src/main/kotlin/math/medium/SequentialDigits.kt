package math.medium

/**
 * An integer has sequential digits if and only if each digit in the number is one more than the previous digit.
 *
 * Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.
 *
 * [URL](https://leetcode.com/problems/sequential-digits/)
 */
object SequentialDigits {
    fun sequentialDigitsOwn(low: Int, high: Int): List<Int> {
        val result = ArrayList<Int>()

        var start = 1
        var next = start
        var curr = start
        while (true) {
            if (start == 10) break
            if (curr in low..high) {
                result.add(curr)
            }
            if (++next == 10 || curr > high) {
                next = ++start
                curr = start
                continue
            }
            curr = curr * 10 + next
        }

        return result.sorted()
    }

    fun sequentialDigitsSlidingWindow(low: Int, high: Int): List<Int> {
        val sample = "123456789"
        val n = 10
        val nums = ArrayList<Int>()

        val lowLen = low.toString().length
        val highLen = high.toString().length

        for (length in lowLen..highLen) {
            for (start in 0 until n - length) {
                val num = sample.substring(start, start + length).toInt()
                if (num in low..high) {
                    nums.add(num)
                }
            }
        }
        return nums
    }
}
