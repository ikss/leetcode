package strings.medium

/**
 * The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
 *
 * * countAndSay(1) = "1"
 * * countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1),
 *  which is then converted into a different digit string.
 *
 * To determine how you "say" a digit string, split it into the minimal number of substrings such that
 * each substring contains exactly one unique digit. Then for each substring, say the number of digits,
 * then say the digit. Finally, concatenate every said digit.
 *
 * [URL](https://leetcode.com/problems/group-anagrams/)
 */
object CountAndSay {
    private val mapOfPrev = mutableMapOf(
        1 to "1",
        2 to "11",
        3 to "21",
        4 to "1211",
        5 to "111221",
        6 to "312211",
        7 to "13112221",
        8 to "1113213211",
        9 to "31131211131221",
        10 to "13211311123113112211"
    )

    fun countAndSay(n: Int): String = mapOfPrev.getOrPut(n) {
        var s = "1"
        for (i in 1 until n) {
            s = countIdx(s)
        }
        s
    }

    private fun countIdx(s: String): String {
        val sb = StringBuilder()

        var count = 0
        var prev: Char? = null

        for (c in s) {
            if (c == prev || prev == null) {
                count++
                prev = c
            } else {
                sb.append(count).append(prev)
                prev = c
                count = 1
            }
        }
        sb.append(count).append(prev)
        return sb.toString()
    }

    fun countAndSayTwoHelpers(n: Int): String {
        var str = "1"
        repeat(n - 1) {
            str = pairsToString(stringToPairs(str))
        }
        return str
    }

    private fun stringToPairs(n: String): List<Pair<Int, Int>> {
        val result = mutableListOf<Pair<Int, Int>>()
        var count = 0
        var prev = -1
        for (c in n) {
            val intval = c - '0'
            if (intval != prev && count > 0) {
                result.add(count to prev)
                count = 0
            }
            prev = intval
            count++
        }
        if (count > 0) {
            result.add(count to prev)
        }
        return result
    }


    private fun pairsToString(pairs: List<Pair<Int, Int>>): String =
        pairs.joinToString("") { "${it.first}${it.second}" }
}