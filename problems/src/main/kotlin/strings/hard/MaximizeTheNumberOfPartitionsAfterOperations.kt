package strings.hard

/**
 * You are given a string s and an integer k.
 *
 * First, you are allowed to change at most one index in s to another lowercase English letter.
 *
 * After that, do the following partitioning operation until s is empty:
 * * Choose the longest prefix of s containing at most k distinct characters.
 * * Delete the prefix from s and increase the number of partitions by one.
 * The remaining characters (if any) in s maintain their initial order.
 *
 * Return an integer denoting the maximum number of resulting partitions after the operations
 * by optimally choosing at most one index to change.
 *
 * [URL](https://leetcode.com/problems/maximize-the-number-of-partitions-after-operations/)
 */
object MaximizeTheNumberOfPartitionsAfterOperations {
    fun maxPartitionsAfterOperations(s: String, k: Int): Int {
        val n = s.length
        val left = Array(n) { IntArray(3) }
        val right = Array(n) { IntArray(3) }

        var num = 0
        var mask = 0
        var count = 0
        for (i in 0..<n - 1) {
            val binary = 1 shl (s[i] - 'a')
            if ((mask and binary) == 0) {
                count++
                if (count <= k) {
                    mask = mask or binary
                } else {
                    num++
                    mask = binary
                    count = 1
                }
            }
            left[i + 1][0] = num
            left[i + 1][1] = mask
            left[i + 1][2] = count
        }

        num = 0
        mask = 0
        count = 0
        for (i in n - 1 downTo 1) {
            val binary = 1 shl (s[i] - 'a')
            if ((mask and binary) == 0) {
                count++
                if (count <= k) {
                    mask = mask or binary
                } else {
                    num++
                    mask = binary
                    count = 1
                }
            }
            right[i - 1][0] = num
            right[i - 1][1] = mask
            right[i - 1][2] = count
        }

        var maxVal = 0
        for (i in 0..<n) {
            var seg = left[i][0] + right[i][0] + 2
            val totMask = left[i][1] or right[i][1]
            val totCount = Integer.bitCount(totMask)
            if (left[i][2] == k && right[i][2] == k && totCount < 26) {
                seg++
            } else if (minOf(totCount + 1, 26) <= k) {
                seg--
            }
            maxVal = maxOf(maxVal, seg)
        }
        return maxVal
    }
}
