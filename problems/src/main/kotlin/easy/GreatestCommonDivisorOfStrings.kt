package easy

/**
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t
 * (i.e., t is concatenated with itself one or more times).
 *
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 *
 * [URL](https://leetcode.com/problems/greatest-common-divisor-of-strings/)
 */
object GreatestCommonDivisorOfStrings {
    fun gcdOfStrings(str1: String, str2: String): String {
        val (small, big) = if (str1.length > str2.length) str2 to str1 else str1 to str2

        var i = 1
        do {
            val div = small.substring(0, small.length / i)
            if (small.length % div.length == 0 && big.length % div.length == 0) {
                if (checkDivisor(div, small) && checkDivisor(div, big)) {
                    return div
                }
            }
            i += 1
        } while (i < small.length)

        return ""
    }

    private fun checkDivisor(div: String, str: String): Boolean {
        for (i in str.indices) {
            if (str[i] != div[i % div.length]) {
                return false
            }
        }
        return true
    }
}