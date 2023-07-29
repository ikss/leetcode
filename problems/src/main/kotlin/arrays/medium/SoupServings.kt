package arrays.medium

/**
 * There are two types of soup: type A and type B. Initially, we have n ml of each type of soup.
 * There are four kinds of operations:
 * * Serve 100 ml of soup A and 0 ml of soup B,
 * * Serve 75 ml of soup A and 25 ml of soup B,
 * * Serve 50 ml of soup A and 50 ml of soup B, and
 * * Serve 25 ml of soup A and 75 ml of soup B.
 *
 * When we serve some soup, we give it to someone, and we no longer have it. Each turn, we will choose from the four
 * operations with an equal probability 0.25. If the remaining volume of soup is not enough to complete the operation,
 * we will serve as much as possible. We stop once we no longer have some quantity of both types of soup.
 *
 * Note that we do not have an operation where all 100 ml's of soup B are used first.
 *
 * Return the probability that soup A will be empty first, plus half the probability that A and B become empty at the
 * same time. Answers within 10-5 of the actual answer will be accepted.
 *
 * [URL](https://leetcode.com/problems/soup-servings/)
 */
object SoupServings {
    fun soupServings(n: Int): Double {
        val m = Math.ceil(n / 25.0).toInt()
        val dp = HashMap<Int, HashMap<Int, Double>>()

        for (k in 1 until m) {
            if (calculateDp(k, k, dp) > (1 - 1e-5)) {
                return 1.0
            }
        }

        return calculateDp(m, m, dp)
    }

    private fun calculateDp(i: Int, j: Int, dp: HashMap<Int, HashMap<Int, Double>>): Double {
        if (i <= 0 && j <= 0) {
            return 0.5
        } else if (i <= 0) {
            return 1.0
        } else if (j <= 0) {
            return 0.0
        }
        dp.get(i)?.get(j)?.let {
            return it
        }
        val result = (
                calculateDp(i - 4, j, dp) +
                calculateDp(i - 3, j - 1, dp) +
                calculateDp(i - 2, j - 2, dp) +
                calculateDp(i - 1, j - 3, dp)
        ) / 4.0
        dp.computeIfAbsent(i) { HashMap() }[j] = result
        return result
    }
}
