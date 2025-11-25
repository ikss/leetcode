package easy

/**
 * You are given a license key represented as a string s that consists of only alphanumeric characters and dashes.
 * The string is separated into n + 1 groups by n dashes. You are also given an integer k.
 *
 * We want to reformat the string s such that each group contains exactly k characters, except for the first group,
 * which could be shorter than k but still must contain at least one character. Furthermore,
 * there must be a dash inserted between two groups, and you should convert all lowercase letters to uppercase.
 *
 * Return the reformatted license key.
 *
 * [URL](https://leetcode.com/problems/license-key-formatting/)
 */
object LicenseKeyFormatting {
    fun licenseKeyFormatting(s: String, k: Int): String {
        val result = StringBuilder()

        var count = 0
        for (i in s.length - 1 downTo 0) {
            val c = s[i]
            if (c == '-') continue
            if (count > 0 && count % k == 0) {
                result.append('-')
            }
            result.append(c.uppercase())
            count++
        }
        return result.reversed().toString()
    }
}
