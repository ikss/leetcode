package strings.medium

/**
 * Given a string containing digits from 2-9 inclusive,
 * return all possible letter combinations that the number could represent.
 * Return the answer in any order.
 *
 * [URL](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)
 */
object LetterCombinationsOfPhoneNumber {

    private val mapping: Map<Char, Set<Char>> = mapOf(
        '2' to setOf('a', 'b', 'c'),
        '3' to setOf('d', 'e', 'f'),
        '4' to setOf('g', 'h', 'i'),
        '5' to setOf('j', 'k', 'l'),
        '6' to setOf('m', 'n', 'o'),
        '7' to setOf('p', 'q', 'r', 's'),
        '8' to setOf('s', 't', 'u'),
        '9' to setOf('w', 'x', 'y', 'z'),
    )

    fun letterCombinationsOfPhoneNumber(digits: String): List<String> {
        if (digits.isEmpty()) return emptyList()
        val chars = digits.toCharArray()
        return cartesianProduct(chars.map { mapping[it]!! })
    }

    private fun cartesianProduct(lists: List<Set<Char>>): List<String> =
        lists.fold(listOf("")) { acc, set ->
            acc.flatMap { list -> set.map { element -> list + element } }
        }

}
