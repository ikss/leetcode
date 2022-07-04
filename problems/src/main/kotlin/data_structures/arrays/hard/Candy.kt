package data_structures.arrays.hard

/**
 * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
 *
 * You are giving candies to these children subjected to the following requirements:
 *
 *  * Each child must have at least one candy.
 *  * Children with a higher rating get more candies than their neighbors.
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
                candies[i] = Math.max(candies[i], candies[i + 1] + 1)
            }
            sum += candies[i]
        }
        return sum
    }
}
