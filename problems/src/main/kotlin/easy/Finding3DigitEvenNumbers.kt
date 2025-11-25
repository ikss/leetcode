package easy

/**
 * You are given an integer array digits, where each element is a digit. The array may contain duplicates.
 *
 * You need to find all the unique integers that follow the given requirements:
 * * The integer consists of the concatenation of three elements from digits in any arbitrary order.
 * * The integer does not have leading zeros.
 * * The integer is even.
 *
 * For example, if the given digits were `[1, 2, 3]`, integers 132 and 312 follow the requirements.
 *
 * Return a sorted array of the unique integers.
 *
 * [URL](https://leetcode.com/problems/finding-3-digit-even-numbers/)
 */
object Finding3DigitEvenNumbers {
    fun findEvenNumbers(digits: IntArray): IntArray {
        val counts = IntArray(10)

        for (d in digits) {
            counts[d]++
        }
        val result = ArrayList<Int>()

        for (i in 1 ..< counts.size) {
            if (counts[i] == 0) continue
            counts[i]--
            solveRecursive(i, counts, result)
            counts[i]++
        }

        return result.toIntArray()
    }

    private fun solveRecursive(curr: Int, counts: IntArray, result: ArrayList<Int>) {
        if (curr >= 100) {
            if (curr % 2 == 0) {
                result.add(curr)
            }
            return
        }

        for (i in counts.indices) {
            if (counts[i] == 0) continue
            counts[i]--
            solveRecursive(curr * 10 + i, counts, result)
            counts[i]++
        }
    }
}
