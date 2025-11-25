package easy

/**
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes,
 * as follows:
 *
 * * 'a' maps to ".-",
 * * 'b' maps to "-...",
 * * 'c' maps to "-.-.", and so on.
 *
 * Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.
 *
 * * For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...".
 *  We will call such a concatenation the transformation of a word.
 *
 * Return the number of different transformations among all words we have.
 *
 * [URL](https://leetcode.com/problems/unique-morse-code-words/)
 */
object UniqueMorseCodeWords {
    private val morse = arrayOf(
        ".-",
        "-...",
        "-.-.",
        "-..",
        ".",
        "..-.",
        "--.",
        "....",
        "..",
        ".---",
        "-.-",
        ".-..",
        "--",
        "-.",
        "---",
        ".--.",
        "--.-",
        ".-.",
        "...",
        "-",
        "..-",
        "...-",
        ".--",
        "-..-",
        "-.--",
        "--..",
    )

    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val result = mutableSetOf<String>()

        for (w in words) {
            val sb = StringBuilder()
            for (c in w) {
                sb.append(morse[c - 'a'])
            }
            result.add(sb.toString())
        }

        return result.size
    }
}
