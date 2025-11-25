package medium

/**
 * You are given an integer num. You will apply the following steps to num two separate times:
 *
 * Pick a digit x (0 <= x <= 9).
 * Pick another digit y (0 <= y <= 9). Note y can be equal to x.
 * Replace all the occurrences of x in the decimal representation of num by y.
 * Let a and b be the two results from applying the operation to num independently.
 *
 * Return the max difference between a and b.
 *
 * Note that neither a nor b may have any leading zeros, and must not be 0.
 *
 * [URL](https://leetcode.com/problems/max-difference-you-can-get-from-changing-an-integer/)
 */
object MaxDifferenceYouCanGetFromChangingInteger {
    fun maxDiff(num: Int): Int {
        val minNum = StringBuilder(num.toString())
        val maxNum = StringBuilder(num.toString())

        for (c in maxNum) {
            if (c != '9') {
                replace(maxNum, c, '9')
                break
            }
        }

        // Replace the most significant bit with 1
        // Or find a high-order digit that is not equal to the highest digit and replace it with 0.
        for (i in 0..<minNum.length) {
            val digit = minNum[i]
            if (i == 0) {
                if (digit != '1') {
                    replace(minNum, digit, '1')
                    break
                }
            } else {
                if (digit != '0' && digit != minNum.get(0)) {
                    replace(minNum, digit, '0')
                    break
                }
            }
        }

        return maxNum.toString().toInt() - minNum.toString().toInt()
    }

    fun replace(s: StringBuilder, x: Char, y: Char) {
        val length = s.length
        for (i in 0..<length) {
            if (s[i] == x) {
                s[i] = y
            }
        }
    }
}
