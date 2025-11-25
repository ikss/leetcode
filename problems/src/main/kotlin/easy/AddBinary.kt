package easy

/**
 * Given two binary strings a and b, return their sum as a binary string.
 *
 * [URL](https://leetcode.com/problems/add-binary/)
 */
object AddBinary {
    fun addBinary(a: String, b: String): String {
        val builder = StringBuilder()

        var currIndex = 1
        var carry = false
        while (a.length >= currIndex || b.length >= currIndex) {
            var sum = 0
            if (a.length >= currIndex && a[a.length - currIndex] == '1') {
                sum += 1
            }
            if (b.length >= currIndex && b[b.length - currIndex] == '1') {
                sum += 1
            }
            if (carry) {
                sum += 1
            }
            if (sum > 1) {
                carry = true
                sum -= 2
            } else {
                carry = false
            }
            currIndex++
            builder.insert(0, sum)
        }
        if (carry) {
            builder.insert(0, 1)
        }
        return builder.toString()
    }
}