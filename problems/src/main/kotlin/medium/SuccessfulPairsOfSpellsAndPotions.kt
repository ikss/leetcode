package medium

/**
 * You are given two positive integer arrays spells and potions, of length n and m respectively, where `spells[i]`
 * represents the strength of the ith spell and `potions[j]` represents the strength of the jth potion.
 *
 * You are also given an integer success. A spell and potion pair is considered successful if the product of their
 * strengths is at least success.
 *
 * Return an integer array pairs of length n where `pairs[i]` is the number of potions that will form a successful pair
 * with the ith spell.
 *
 * [URL](https://leetcode.com/problems/successful-pairs-of-spells-and-potions/)
 */
object SuccessfulPairsOfSpellsAndPotions {
    fun successfulPairs(spells: IntArray, potions: IntArray, success: Long): IntArray {
        val m = potions.size

        val sortedSpells = spells.withIndex().sortedBy { it.value }

        potions.sort()

        val result = IntArray(spells.size)
        var pi = m - 1

        for ((si, sv) in sortedSpells) {
            while (pi >= 0 && potions[pi].toLong() * sv >= success) {
                pi--
            }
            result[si] = m - pi - 1
        }

        return result
    }
}
