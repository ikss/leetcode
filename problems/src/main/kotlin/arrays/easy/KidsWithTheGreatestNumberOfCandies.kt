package arrays.easy

/**
 * There are n kids with candies. You are given an integer array candies, where each `candies[i]` represents the number
 * of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
 *
 * Return a boolean array result of length n, where `result[i]` is true if, after giving the ith kid
 * all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
 *
 * Note that multiple kids can have the greatest number of candies.
 *
 * [URL](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)
 */
object KidsWithTheGreatestNumberOfCandies {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val max = candies.max()

        val result = ArrayList<Boolean>()

        for (c in candies) {
            result.add(c + extraCandies >= max)
        }

        return result
    }
}
