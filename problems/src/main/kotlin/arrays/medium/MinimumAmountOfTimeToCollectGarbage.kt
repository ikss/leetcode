package arrays.medium

/**
 * You are given a 0-indexed array of strings garbage where `garbage[i]` represents the assortment of garbage
 * at the ith house. `garbage[i]` consists only of the characters 'M', 'P' and 'G' representing one unit of metal, paper
 * and glass garbage respectively. Picking up one unit of any type of garbage takes 1 minute.
 *
 * You are also given a 0-indexed integer array travel where `travel[i]` is the number of minutes needed to go
 * from house i to house i + 1.
 *
 * There are three garbage trucks in the city, each responsible for picking up one type of garbage. Each garbage truck
 * starts at house 0 and must visit each house in order; however, they do not need to visit every house.
 *
 * Only one garbage truck may be used at any given moment. While one truck is driving or picking up garbage, the other
 * two trucks cannot do anything.
 *
 * Return the minimum number of minutes needed to pick up all the garbage.
 *
 * [URL](https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/)
 */
object MinimumAmountOfTimeToCollectGarbage {
    fun garbageCollection(garbage: Array<String>, travel: IntArray): Int {
        val metal = mutableMapOf<Int, Int>()
        val glass = mutableMapOf<Int, Int>()
        val paper = mutableMapOf<Int, Int>()

        for (i in garbage.indices) {
            val g = garbage[i]
            for (t in g) {
                when (t) {
                    'M' -> metal[i] = metal.getOrDefault(i, 0) + 1
                    'G' -> glass[i] = glass.getOrDefault(i, 0) + 1
                    'P' -> paper[i] = paper.getOrDefault(i, 0) + 1
                }
            }
        }

        return getSum(listOf(metal, glass, paper), travel)
    }

    private fun getSum(garbage: List<Map<Int, Int>>, travel: IntArray): Int {
        var sum = 0
        garbage.forEach { g ->
            var curr = 0
            for ((idx, amount) in g) {
                sum += amount
                if (idx > 0) {
                    for (i in curr until idx) {
                        sum += travel[i]
                    }
                }
                curr = idx
            }
        }
        return sum
    }
}
