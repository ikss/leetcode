package medium

/**
 * We know that 4 and 7 are lucky digits. Also, a number is called lucky if it contains only lucky digits.
 *
 * You are given an integer k, return the kth lucky number represented as a string.
 *
 * [URL](https://leetcode.com/problems/find-the-k-th-lucky-number/)
 */
object FindTheKthLuckyNumber {
    // TLE
    fun kthLuckyNumberGenerate(k: Int): String {
        val result = StringBuilder("4")

        for (i in 1 until k) {
            var toReplace = -1

            for (i in result.length - 1 downTo 0) {
                if (result[i] == '4') {
                    toReplace = i
                    break
                }
            }

            if (toReplace != -1) {
                result[toReplace] = '7'
                for (i in toReplace + 1 until result.length) {
                    result[i] = '4'
                }
            } else {
                for (i in 0 until result.length) {
                    result[i] = '4'
                }
                result.append('4')
            }

        }

        return result.toString()
    }

    fun kthLuckyNumberBitManipulation(k: Int): String {
        val k = k + 1

        val binaryString = Integer.toBinaryString(k).substring(1)

        val kthLuckyNum = binaryString.toCharArray()

        for (i in kthLuckyNum.indices) {
            kthLuckyNum[i] = if (kthLuckyNum[i] == '1') '7' else '4'
        }

        return String(kthLuckyNum)
    }
}
