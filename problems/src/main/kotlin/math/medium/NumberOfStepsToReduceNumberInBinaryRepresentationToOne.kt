package math.medium

/**
 * Given the binary representation of an integer as a string s, return the number of steps to reduce it to 1 under the following rules:
 * * If the current number is even, you have to divide it by 2.
 * * If the current number is odd, you have to add 1 to it.
 *
 * It is guaranteed that you can always reach one for all test cases.
 *
 * [URL](leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/)
 */
object NumberOfStepsToReduceNumberInBinaryRepresentationToOne {
    fun numSteps(s: String): Int {
        var result = 0
        var carry = 0

        for (i in s.length - 1 downTo 1) {
            result++
            if (s[i] - '0' + carry == 1) {
                result++
                carry = 1
            }
        }

        return result + carry
    }
}
