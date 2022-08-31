package strings.medium

/**
 * Given a string s, you can transform every letter individually to be lowercase or uppercase to create another string.
 *
 * Return a list of all possible strings we could create. Return the output in any order.
 *
 * [URL](https://leetcode.com/problems/letter-case-permutation/)
 */
object LetterCasePermutation {

    fun letterCasePermutation(s: String): List<String> {
        val result = mutableListOf<String>()
        permute(result, mutableListOf(), s, 0)
        return result
    }

    private fun permute(result: MutableList<String>, temp: MutableList<Char>, s: String, index: Int) {
        if (s.length == temp.size) {
            result.add(String(temp.toCharArray()))
            return
        }

        val c = s[index]
        if (c.isLetter()) {
            temp.add(c.toLowerCase())
            permute(result, temp, s, index + 1)
            temp.removeAt(index)

            temp.add(c.toUpperCase())
            permute(result, temp, s, index + 1)
        } else {
            temp.add(c)
            permute(result, temp, s, index + 1)
        }
        temp.removeAt(index)
    }
}
