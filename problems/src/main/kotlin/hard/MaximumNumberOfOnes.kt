package hard

/**
 * Consider a matrix M with dimensions width * height, such that every cell has value 0 or 1,
 * and any square sub-matrix of M of size sideLength * sideLength has at most maxOnes ones.
 *
 * Return the maximum possible number of ones that the matrix M can have.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-ones/)
 */
object MaximumNumberOfOnes {
    fun maximumNumberOfOnes(width: Int, height: Int, sideLength: Int, maxOnes: Int): Int {
        val count = ArrayList<Int>()

        for (r in 0..<sideLength) {
            for (c in 0..<sideLength) {
                count.add((1 + (width - 1 - c) / sideLength) * (1 + (height - 1 - r) / sideLength))
            }
        }

        count.sortWith(Comparator.reverseOrder())
        var answer = 0
        for (i in 0..<maxOnes) {
            answer += count[i]
        }

        return answer
    }
}
