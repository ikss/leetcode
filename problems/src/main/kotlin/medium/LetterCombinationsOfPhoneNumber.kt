package medium

/**
 * Given a string containing digits from 2-9 inclusive,
 * return all possible letter combinations that the number could represent.
 * Return the answer in any order.
 *
 * [URL](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)
 */
object LetterCombinationsOfPhoneNumber {
    private val mapping = listOf(
        listOf('a', 'b', 'c'),
        listOf('d', 'e', 'f'),
        listOf('g', 'h', 'i'),
        listOf('j', 'k', 'l'),
        listOf('m', 'n', 'o'),
        listOf('p', 'q', 'r', 's'),
        listOf('t', 'u', 'v'),
        listOf('w', 'x', 'y', 'z')
    )

    fun letterCombinationsOfPhoneNumber(digits: String): List<String> {
        if (digits.isEmpty()) return emptyList()
        val chars = digits.toCharArray()
        return cartesianProduct(chars.map { mapping[it - '2'] })
    }

    private fun cartesianProduct(lists: List<List<Char>>): List<String> =
        lists.fold(listOf("")) { acc, set ->
            acc.flatMap { list -> set.map { element -> list + element } }
        }

    fun letterCombinationsBacktrack(digits: String): List<String> {
        if (digits.isEmpty()) return emptyList()
        val result = ArrayList<String>()

        backtrack(digits.toCharArray(), ArrayList(), result)

        return result
    }

    private fun backtrack(digits: CharArray, currDigits: ArrayList<Char>, result: ArrayList<String>) {
        val nextIndex = currDigits.size
        if (nextIndex == digits.size) {
            result.add(String(currDigits.toCharArray()))
            return
        }

        for (c in mapping[digits[nextIndex] - '2']) {
            currDigits.add(c)
            backtrack(digits, currDigits, result)
            currDigits.removeAt(nextIndex)
        }
    }
}
