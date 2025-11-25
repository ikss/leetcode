package medium

/**
 * You are given an array people where `people[i]` is the weight of the ith person, and an infinite number of boats
 * where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time,
 * provided the sum of the weight of those people is at most limit.
 *
 * Return the minimum number of boats to carry every given person.
 *
 * [URL](https://leetcode.com/problems/boats-to-save-people/)
 */
object BoatsToSavePeople {
    fun numRescueBoats(people: IntArray, limit: Int): Int {
        people.sort()

        var left = 0
        var right = people.size - 1
        var result = 0

        while (left <= right) {
            result++
            if (people[left] + people[right] <= limit) {
                left++
            }
            right--
        }

        return result
    }
}
