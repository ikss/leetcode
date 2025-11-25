package easy

/**
 * The array-form of an integer num is an array representing its digits in left to right order.
 *
 * For example, for num = 1321, the array form is `[1,3,2,1]`.
 * Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
 *
 * [URL](https://leetcode.com/problems/add-to-array-form-of-integer/)
 */
object AddToArrayFormOfInteger {
    fun addToArrayFormSimple(num: IntArray, k: Int): List<Int> {
        val result = mutableListOf<Int>()

        var index = 0
        var k = k
        var carry = 0
        while (num.size > index || k > 0) {
            val knum = k % 10
            k /= 10
            val n = if (num.size > index) num[num.size - index - 1] else 0
            var sum = knum + n + carry
            if (sum >= 10) {
                carry = 1
                sum -= 10
            } else {
                carry = 0
            }
            index++
            result.add(0, sum)
        }
        if (carry == 1) {
            result.add(0, 1)
        }

        return result
    }

    fun addToArrayFormOfficial(num: IntArray, k: Int): List<Int> {
        val n = num.size
        var cur = k
        val ans = ArrayList<Int>()
        var i = n
        while (--i >= 0 || cur > 0) {
            if (i >= 0) cur += num[i]
            ans.add(cur % 10)
            cur /= 10
        }
        return ans.reversed()
    }
}