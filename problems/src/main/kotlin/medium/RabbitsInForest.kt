package medium

/**
 * There is a forest with an unknown number of rabbits.
 * We asked n rabbits "How many rabbits have the same color as you?" and collected the answers in an integer array
 * answers where `answers[i]` is the answer of the ith rabbit.
 *
 * Given the array answers, return the minimum number of rabbits that could be in the forest.
 *
 * [URL](https://leetcode.com/problems/rabbits-in-forest/)
 */
object RabbitsInForest {
    fun numRabbits(answers: IntArray): Int {
        val counts = IntArray(1001)
        for (a in answers) {
            counts[a]++
        }

        var result = 0

        for (i in counts.indices) {
            val c = counts[i]
            if (c == 0) continue

            if (i == 0) {
                result += c
            } else {
                // c              i -> result
                // 5 rabbits said 4 -> 5
                // 6 rabbits said 4 -> 10

                val div = i + 1
                val count = div * ((c + i) / div)

                result += count
            }
        }
        return result
    }
}
