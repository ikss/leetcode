package strings.easy

/**
 * There is a special keyboard with all keys in a single row.
 *
 * Given a string keyboard of length 26 indicating the layout of the keyboard (indexed from 0 to 25).
 * Initially, your finger is at index 0. To type a character, you have to move your finger to the index of
 * the desired character. The time taken to move your finger from index i to index j is |i - j|.
 *
 * You want to type a string word. Write a function to calculate how much time it takes to type it with one finger.
 *
 * [URL](https://leetcode.com/problems/single-row-keyboard/)
 */
object SingleRowKeyboard {
    fun calculateTime(keyboard: String, word: String): Int {
        val map = IntArray(26)

        for (i in keyboard.indices) {
            map[keyboard[i] - 'a'] = i
        }

        var result = 0
        var prev = 0

        for (c in word) {
            val next = map[c - 'a']
            result += Math.abs(prev - next)
            prev = next
        }

        return result
    }
}