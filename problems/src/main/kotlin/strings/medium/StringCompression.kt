package strings.medium

/**
 * Given an array of characters chars, compress it using the following algorithm:
 *
 * Begin with an empty string s. For each group of consecutive repeating characters in chars:
 * * If the group's length is 1, append the character to s.
 * * Otherwise, append the character followed by the group's length.
 *
 * The compressed string s should not be returned separately, but instead, be stored in the input character array chars.
 * Note that group lengths that are 10 or longer will be split into multiple characters in chars.
 *
 * After you are done modifying the input array, return the new length of the array.
 *
 * You must write an algorithm that uses only constant extra space.
 *
 * [URL](https://leetcode.com/problems/string-compression/)
 */
object StringCompression {
    fun compressNaive(chars: CharArray): Int {
        val sb = StringBuilder()

        var char = chars[0]
        var count = 1
        for (i in 1 until chars.size) {
            if (char != chars[i]) {
                sb.append(char)
                if (count > 1) {
                    sb.append(count)
                }
                char = chars[i]
                count = 0
            }
            count++
        }
        sb.append(char)
        if (count > 1) {
            sb.append(count)
        }

        for (i in sb.indices) {
            chars[i] = sb[i]
        }
        return sb.length
    }

    fun compressOptimized(chars: CharArray): Int {
        var indexCompressed = 0
        var c = chars[0]
        var count = 1

        for (i in 1 until chars.size) {
            if (c != chars[i]) {
                chars[indexCompressed++] = c
                if (count > 1) {
                    val s = count.toString()
                    for (si in s.indices) {
                        chars[indexCompressed++] = s[si]
                    }
                }
                c = chars[i]
                count = 0
            }
            count++
        }

        chars[indexCompressed++] = c
        if (count > 1) {
            val s = count.toString()
            for (si in s.indices) {
                chars[indexCompressed++] = s[si]
            }
        }
        return indexCompressed
    }
}
