package medium

/**
 * Given a wordlist, we want to implement a spellchecker that converts a query word into a correct word.
 *
 * For a given query word, the spell checker handles two categories of spelling mistakes:
 * * Capitalization: If the query matches a word in the wordlist (case-insensitive),
 * then the query word is returned with the same case as the case in the wordlist.
 *    * Example: wordlist = ["yellow"], query = "YellOw": correct = "yellow"
 *    * Example: wordlist = ["Yellow"], query = "yellow": correct = "Yellow"
 *    * Example: wordlist = ["yellow"], query = "yellow": correct = "yellow"
 * * Vowel Errors: If after replacing the vowels ('a', 'e', 'i', 'o', 'u') of the query word with any vowel
 * individually, it matches a word in the wordlist (case-insensitive), then the query word is returned with the same
 * case as the match in the wordlist.
 *    * Example: wordlist = ["YellOw"], query = "yollow": correct = "YellOw"
 *    * Example: wordlist = ["YellOw"], query = "yeellow": correct = "" (no match)
 *    * Example: wordlist = ["YellOw"], query = "yllw": correct = "" (no match)
 *
 * In addition, the spell checker operates under the following precedence rules:
 * * When the query exactly matches a word in the wordlist (case-sensitive), you should return the same word back.
 * * When the query matches a word up to capitlization, you should return the first such match in the wordlist.
 * * When the query matches a word up to vowel errors, you should return the first such match in the wordlist.
 * * If the query has no matches in the wordlist, you should return the empty string.
 *
 * Given some queries, return a list of words answer, where `answer[i]` is the correct word for `query = queries[i]`.
 *
 * [URL](https://leetcode.com/problems/vowel-spellchecker/)
 */
object VowelSpellchecker {

    fun spellchecker(wordlist: Array<String>, queries: Array<String>): Array<String> {
        val caseSensitive = HashSet<String>()
        val caseInsensitiveWithoutVowels = HashMap<String, String>()


        for (i in wordlist.size - 1 downTo 0) {
            val w = wordlist[i]
            caseSensitive.add(w)
            caseInsensitiveWithoutVowels[w.lowercase()] = w
            caseInsensitiveWithoutVowels[replaceVowels(w).lowercase()] = w
        }

        val result = Array(queries.size) { "" }

        for (i in queries.indices) {
            val q = queries[i]
            if (q in caseSensitive) {
                result[i] = q
                continue
            }
            val ignoreCase = caseInsensitiveWithoutVowels[q.lowercase()]
            if (ignoreCase != null) {
                result[i] = ignoreCase
                continue
            }
            val woVowels = caseInsensitiveWithoutVowels[replaceVowels(q).lowercase()]
            if (woVowels != null) {
                result[i] = woVowels
            }
        }

        return result
    }

    private fun replaceVowels(s: String): String {
        val result = StringBuilder()

        for (c in s) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                result.append('_')
            } else {
                result.append(c)
            }
        }

        return result.toString()
    }
}
