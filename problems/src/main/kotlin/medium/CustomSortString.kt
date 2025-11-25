package medium

/**
 * You are given two strings order and s. All the characters of order are unique
 * and were sorted in some custom order previously.
 *
 * Permute the characters of s so that they match the order that order was sorted. More specifically,
 * if a character x occurs before a character y in order, then x should occur before y in the permuted string.
 *
 * Return any permutation of s that satisfies this property.
 *
 * [URL](https://leetcode.com/problems/custom-sort-string/)
 */
object CustomSortString {
    fun customSortString(order: String, s: String): String {
        val countMap = HashMap<Char, Int>()
        for (c in s) {
            countMap.merge(c, 1, Int::plus)
        }

        val result = StringBuilder()
        for (c in order) {
            val count = countMap[c] ?: continue
            repeat(count) {
                result.append(c)
            }
            countMap[c] = 0
        }
        for ((c, count) in countMap) {
            repeat(count) {
                result.append(c)
            }
        }

        return result.toString()
    }
}
