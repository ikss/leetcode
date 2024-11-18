package arrays.easy

/**
 * You have a bomb to defuse, and your time is running out! Your informer will provide you with a circular array code
 * of length of n and a key k.
 *
 * To decrypt the code, you must replace every number. All the numbers are replaced simultaneously.
 * * If k > 0, replace the ith number with the sum of the next k numbers.
 * * If k < 0, replace the ith number with the sum of the previous k numbers.
 * * If k == 0, replace the ith number with 0.
 *
 * As code is circular, the next element of code[n-1] is code[0], and the previous element of code[0] is code[n-1].
 *
 * Given the circular array code and an integer key k, return the decrypted code to defuse the bomb!
 *
 * [URL](https://leetcode.com/problems/defuse-the-bomb/)
 */
object DefuseTheBomb {
    fun decrypt(code: IntArray, k: Int): IntArray {
        val result = IntArray(code.size)
        if (k == 0) return result
        var start = 1
        var end = k
        var sum = 0

        if (k < 0) {
            start = code.size - Math.abs(k)
            end = code.size - 1
        }
        for (i in start..end) {
            sum += code[i]
        }
        for (i in code.indices) {
            result[i] = sum
            sum -= code[(start) % code.size]
            sum += code[(end + 1) % code.size]
            start++
            end++
        }
        return result
    }
}
