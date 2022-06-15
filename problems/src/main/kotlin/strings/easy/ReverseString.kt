package strings.easy

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * [URL](https://leetcode.com/problems/reverse-string/)
 */
object ReverseString {
    fun reverseString(s: CharArray) {
        val size = s.size
        if (size < 2) return

        var start = 0
        var end = size - 1
        var temp: Char

        while (start < end) {
            temp = s[start]
            s[start] = s[end]
            s[end] = temp
            start++
            end--
        }
    }
}
