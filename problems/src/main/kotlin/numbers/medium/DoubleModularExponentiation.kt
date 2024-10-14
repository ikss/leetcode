package numbers.medium

import java.math.BigDecimal

/**
 * You are given a 0-indexed 2D array variables where `variables[i] = [ai, bi, ci, mi]`, and an integer target.
 *
 * An index i is good if the following formula holds:
 * * 0 <= i < variables.length
 * * ((ai^bi % 10)^ci) % mi == target
 *
 * Return an array consisting of good indices in any order.
 *
 * [URL](https://leetcode.com/problems/double-modular-exponentiation/)
 */
object DoubleModularExponentiation {
    fun getGoodIndicesBigDecimal(variables: Array<IntArray>, target: Int): List<Int> {
        val result = ArrayList<Int>()

        for (i in variables.indices) {
            if (isGood(variables[i], target)) {
                result.add(i)
            }
        }

        return result
    }

    private fun isGood(arr: IntArray, target: Int): Boolean {
        val (a, b, c, m) = arr
        return BigDecimal(a).pow(b).rem(BigDecimal(10)).pow(c).rem(BigDecimal(m)) == BigDecimal(target)
    }

    fun getGoodIndicesSimulation(variables: Array<IntArray>, target: Int): List<Int> {
        val result = ArrayList<Int>()

        for (i in variables.indices) {
            if (isGoodSimulation(variables[i], target)) {
                result.add(i)
            }
        }

        return result
    }

    private fun isGoodSimulation(arr: IntArray, target: Int): Boolean {
        var (a, b, c, m) = arr
        var rem = a % 10

        var result = rem

        while (--b > 0) {
            result = (result * rem) % 10
        }
        result %= m
        rem = result

        while (--c > 0) {
            result = (result * rem) % m
        }

        return result == target
    }
}