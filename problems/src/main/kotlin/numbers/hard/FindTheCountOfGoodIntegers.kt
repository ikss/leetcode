package numbers.hard

import java.util.*
import kotlin.math.pow

/**
 * You are given two positive integers n and k.
 *
 * An integer x is called k-palindromic if:
 * * x is a palindrome.
 * * x is divisible by k.
 *
 * An integer is called good if its digits can be rearranged to form a k-palindromic integer. For example, for k = 2,
 * 2020 can be rearranged to form the k-palindromic integer 2002, whereas 1010 cannot be rearranged
 * to form a k-palindromic integer.
 *
 * Return the count of good integers containing n digits.
 *
 * Note that any integer must not have leading zeros, neither before nor after rearrangement.
 * For example, 1010 cannot be rearranged to form 101.
 *
 * [URL](https://leetcode.com/problems/find-the-count-of-good-integers/)
 */
object FindTheCountOfGoodIntegers {

    fun countGoodIntegers(n: Int, k: Int): Long {
        val dict: MutableSet<String> = HashSet()
        val base = 10.0.pow(((n - 1) / 2).toDouble()).toInt()
        val skip = n and 1
        /* Enumerate the number of palindrome numbers of n digits */
        for (i in base..<base * 10) {
            var s = i.toString()
            s += StringBuilder(s).reverse().substring(skip)
            val palindromicInteger = s.toLong()
            /* If the current palindrome number is a k-palindromic integer */
            if (palindromicInteger % k == 0L) {
                val chars = s.toCharArray().sortedArray()
                dict.add(String(chars))
            }
        }

        val factorial = LongArray(n + 1)
        factorial[0] = 1
        for (i in 1..n) {
            factorial[i] = factorial[i - 1] * i
        }
        var ans = 0L
        
        for (s in dict) {
            val cnt = IntArray(10)
            for (c in s.toCharArray()) {
                cnt[c - '0']++
            }
            /* Calculate permutations.sor and combinations */
            var tot = (n - cnt[0]) * factorial[n - 1]

            for (x in cnt) {
                tot /= factorial[x]
            }
            ans += tot
        }

        return ans
    }
}
