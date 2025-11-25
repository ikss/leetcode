@file:Suppress("DEPRECATED_IDENTITY_EQUALS")

package medium

import java.util.*

/**
 * Given an m x n binary matrix mat, return the number of submatrices that have all ones.
 *
 * [URL](https://leetcode.com/problems/count-submatrices-with-all-ones/)
 */
object CountSubmatricesWithAllOnes {
    fun numSubmat(mat: Array<IntArray>): Int {
        val m = mat.size
        val n = mat[0].size
        val height = IntArray(n)
        var result = 0

        for (i in 0 until m) {
            val st = Stack<Pair<Int, Int>>()

            for (j in 0 until n) {
                height[j] = if (mat[i][j] === 0) 0 else (height[j] + 1)

                var sum = 0
                while (!st.isEmpty() && height[st.peek().first] >= height[j]) {
                    st.pop()
                }
                if (!st.isEmpty()) {
                    val (prevIndex, prevSum) = st.peek()
                    sum += height[j] * (j - prevIndex) + prevSum
                } else {
                    sum += height[j] * (j + 1)
                }
                st.push(j to sum)
                result += sum
            }
        }
        return result
    }
}
