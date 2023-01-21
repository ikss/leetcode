package arrays.medium

/**
 * A valid IP address consists of exactly four integers separated by single dots. Each integer is between 0 and
 * 255 (inclusive) and cannot have leading zeros.
 * * For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses, but "0.011.255.245", "192.168.1.312" and
 * "192.168@1.1" are invalid IP addresses.
 *
 *  Given a string s containing only digits, return all possible valid IP addresses that can be formed by inserting dots
 *  into s. You are not allowed to reorder or remove any digits in s. You may return the valid IP addresses in any order.
 *
 * [URL](https://leetcode.com/problems/restore-ip-addresses/)
 */
object RestoreIPAddresses {
    fun restoreIpAddresses(s: String): List<String> {
        val result = mutableListOf<String>()

        var len1 = maxOf(1, s.length - 9)
        while (len1 <= 3 && len1 <= s.length - 3) {
            if (!isValid(s, 0, len1)) {
                ++len1
                continue
            }

            var len2 = maxOf(1, s.length - len1 - 6)
            while (len2 <= 3 && len2 <= s.length - len1 - 2) {
                if (!isValid(s, len1, len2)) {
                    ++len2
                    continue
                }

                var len3 = maxOf(1, s.length - len1 - len2 - 3)
                while (len3 <= 3 && len3 <= s.length - len1 - len2 - 1) {
                    if (isValid(s, len1 + len2, len3) &&
                        isValid(s, len1 + len2 + len3, s.length - len1 - len2 - len3)
                    ) {
                        result.add(
                            java.lang.String.join(
                                ".",
                                s.substring(0, len1),
                                s.substring(len1, len1 + len2),
                                s.substring(len1 + len2, len1 + len2 + len3),
                                s.substring(len1 + len2 + len3)
                            )
                        )
                    }
                    ++len3
                }
                ++len2
            }
            ++len1
        }
        return result
    }

    private fun isValid(s: String, start: Int, length: Int): Boolean =
        length == 1 || s[start] != '0' && (length < 3 || s.substring(start, start + length) <= "255")

}
