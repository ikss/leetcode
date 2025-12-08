package easy

/**
 * A square triple (a,b,c) is a triple where a, b, and c are integers and a2 + b2 = c2.
 *
 * Given an integer n, return the number of square triples such that 1 <= a, b, c <= n.
 *
 * [URL](https://leetcode.com/problems/count-square-sum-triples/)
 */
object CountSquareSumTriples {
    fun countTriples(n: Int): Int {
        var result = 0
        var squares = IntArray(n + 1) { it * it }.toSet()

        for (a in 1 .. n) {
            for (b in a + 1 .. n) {
                if (a * a + b * b in squares) {
                    result += 2
                }
            }
        }

        return result
    }
}
