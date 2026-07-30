package easy

/**
 * You are given a string word containing distinct lowercase English letters.
 *
 * Telephone keypads have keys mapped with distinct collections of lowercase English letters,
 * which can be used to form words by pushing them. For example, the key 2 is mapped with ["a","b","c"],
 * we need to push the key one time to type "a", two times to type "b", and three times to type "c" .
 *
 * It is allowed to remap the keys numbered 2 to 9 to distinct collections of letters.
 * The keys can be remapped to any amount of letters, but each letter must be mapped to exactly one key.
 * You need to find the minimum number of times the keys will be pushed to type the string word.
 *
 * Return the minimum number of pushes needed to type word after remapping the keys.
 *
 * An example mapping of letters to keys on a telephone keypad is given below.
 * Note that 1, *, #, and 0 do not map to any letters.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/)
 */
object MinimumNumberOfPushesToTypeWordI {
    fun minimumPushesSimulation(word: String): Int {
        var left = word.length

        var result = 0
        var currPress = 1
        while (left >= 8) {
            result += 8 * currPress
            left -= 8
            currPress++
        }
        return result + left * currPress
    }

    fun minimumPushesMath(word: String): Int {
        val n = word.length

        val covered = n / 8
        val total = covered * (covered + 1) / 2

        return 8 * total + (n % 8) * (covered + 1)
    }
}
