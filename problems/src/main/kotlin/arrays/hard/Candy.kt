package arrays.hard

/**
 * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
 *
 * You are giving candies to these children subjected to the following requirements:
 *
 * * Each child must have at least one candy.
 * * Children with a higher rating get more candies than their neighbors.
 *
 * Return the minimum number of candies you need to have to distribute the candies to the children.
 *
 * [URL](https://leetcode.com/problems/candy/)
 */
object Candy {
    fun candy(ratings: IntArray): Int {
        val candies = IntArray(ratings.size) { 1 }

        for (i in 1 until ratings.size) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1
            }
        }
        var sum = candies.last()

        for (i in ratings.size - 2 downTo 0) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = maxOf(candies[i], candies[i + 1] + 1)
            }
            sum += candies[i]
        }
        return sum
    }

    fun candySelf(ratings: IntArray): Int {
        val size = ratings.size
        val candies = IntArray(size) { 1 }

        var result = size
        var distributed = true
        while (distributed) {
            distributed = false
            for (i in ratings.indices) {
                if (i > 0) {
                    if (ratings[i] > ratings[i - 1] && candies[i] <= candies[i - 1]) {
                        val delta = candies[i - 1] - candies[i] + 1
                        result += delta
                        candies[i] += delta
                        distributed = true
                    }
                }
                if (i < size - 1) {
                    if (ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
                        val delta = candies[i + 1] - candies[i] + 1
                        result += delta
                        candies[i] += delta
                        distributed = true
                    }
                }
            }
        }
        return result
    }
}
