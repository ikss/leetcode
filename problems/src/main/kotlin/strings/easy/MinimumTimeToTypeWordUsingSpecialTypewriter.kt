package strings.easy

/**
 * There is a special typewriter with lowercase English letters 'a' to 'z' arranged in a circle with a pointer.
 * A character can only be typed if the pointer is pointing to that character.
 * The pointer is initially pointing to the character 'a'.
 *
 * Each second, you may perform one of the following operations:
 *
 * Move the pointer one character counterclockwise or clockwise.
 * Type the character the pointer is currently on.
 * Given a string word, return the minimum number of seconds to type out the characters in word.
 *
 * [URL](https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter/)
 */
object MinimumTimeToTypeWordUsingSpecialTypewriter {
    fun minTimeToType(word: String): Int {
        var result = word.length
        var curr = 'a'

        for (c in word) {
            val diff = Math.abs(curr - c)
            result += if (diff > 13) 26 - diff else diff
            curr = c
        }

        return result
    }
}