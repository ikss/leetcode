package arrays.easy

/**
 * Given the array nums consisting of 2n elements in the form `[x1,x2,...,xn,y1,y2,...,yn]`.
 *
 * Return the array in the form `[x1,y1,x2,y2,...,xn,yn]`.
 *
 * [URL](https://leetcode.com/problems/shuffle-the-array/)
 */
object ShuffleTheArray {
    fun shuffleNaive(nums: IntArray, n: Int): IntArray {
        val result = IntArray(2*n)
        for (i in 0 until n) {
            result[2*i] = nums[i]
            result[2*i+1] = nums[i+n]
        }
        return result
    }

    fun shuffleWithBits(nums: IntArray, n: Int): IntArray? {
        // Store each y(i) with respective x(i).
        for (i in n until 2 * n) {
            val secondNum = nums[i] shl 10
            nums[i - n] = nums[i - n] or secondNum
        }

        // '0000000000 1111111111' in decimal.
        val allOnes = Math.pow(2.0, 10.0).toInt() - 1

        // We will start putting all numbers from the end,
        // as they are empty places.
        for (i in n - 1 downTo 0) {
            // Fetch both the numbers from the current index.
            val secondNum = nums[i] shr 10
            val firstNum = nums[i] and allOnes
            nums[2 * i + 1] = secondNum
            nums[2 * i] = firstNum
        }
        return nums
    }
}
