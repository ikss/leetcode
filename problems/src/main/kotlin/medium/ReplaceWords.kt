package medium

/**
 * In English, we have a concept called root, which can be followed by some other word to form another
 * longer word - let's call this word derivative. For example, when the root "help" is followed by the word "ful",
 * we can form a derivative "helpful".
 *
 * Given a dictionary consisting of many roots and a sentence consisting of words separated by spaces, replace all the
 * derivatives in the sentence with the root forming it.
 * If a derivative can be replaced by more than one root, replace it with the root that has the shortest length.
 *
 * Return the sentence after the replacement.
 *
 * [URL](https://leetcode.com/problems/replace-words/)
 */
object ReplaceWords {
    fun replaceWords(dictionary: List<String>, sentence: String): String {
        val sorted = dictionary.sortedBy { it.length }

        val result = StringBuilder()

        for (word in sentence.split(" ")) {
            if (result.isNotEmpty()) result.append(' ')
            var found = false
            for (root in sorted) {
                if (word.startsWith(root)) {
                    result.append(root)
                    found = true
                    break
                }
            }
            if (!found) result.append(word)
        }

        return result.toString()
    }
}