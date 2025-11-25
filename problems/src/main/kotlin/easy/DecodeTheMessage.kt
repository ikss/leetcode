package easy

/**
 * You are given the strings key and message, which represent a cipher key and a secret message, respectively.
 * The steps to decode message are as follows:

 * * Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
 * * Align the substitution table with the regular English alphabet.
 * * Each letter in message is then substituted using the table.
 * * Spaces ' ' are transformed to themselves.
 *
 * * For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet),
 *  we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
 *
 * Return the decoded message.
 *
 * [URL](https://leetcode.com/problems/decode-the-message/)
 */
object DecodeTheMessage {
    fun decodeMessage(key: String, message: String): String {
        val result = StringBuilder()
        val cache = mutableMapOf<Char, Char>()
        var char = 'a'

        for (c in key) {
            if (c == ' ' || cache.containsKey(c)) {
                continue
            }
            cache[c] = char++
            if (cache.size == 26) break
        }

        for (c in message) {
            val substitution = cache[c]
            result.append(substitution ?: c)
        }
        return result.toString()
    }
}
