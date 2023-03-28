package strings.medium

/**
 * Given two integers a and b, return any string s such that:
 * * s has length a + b and contains exactly a 'a' letters, and exactly b 'b' letters,
 * * The substring 'aaa' does not occur in s, and
 * * The substring 'bbb' does not occur in s.
 *
 * [URL](https://leetcode.com/problems/string-without-aaa-or-bbb/)
 */
object StringWithoutAAAOrBBB {
    fun strWithout3a3b(a: Int, b: Int): String {
        var a = a
        var b = b

        val result = StringBuilder()
        while (a > 0 || b > 0) {
            var writeA = a >= b
            val l = result.length
            if (l >= 2 && result[l - 1] == result[l - 2]) {
                writeA = result[l - 1] == 'b'
            }
            if (writeA) {
                a--
                result.append('a')
            } else {
                b--
                result.append('b')
            }
        }

        return result.toString()
    }
}
