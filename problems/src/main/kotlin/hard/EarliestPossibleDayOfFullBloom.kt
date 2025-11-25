package hard

/**
 * You have n flower seeds. Every seed must be planted first before it can begin to grow, then bloom.
 * Planting a seed takes time and so does the growth of a seed. You are given two 0-indexed integer arrays
 * _plantTime_ and _growTime_, of length n each:
 *
 * * `plantTime[i]` is the number of full days it takes you to plant the ith seed. Every day,
 * you can work on planting exactly one seed. You do not have to work on planting the same seed on consecutive days,
 * but the planting of a seed is not complete until you have worked `plantTime[i]` days on planting it in total.
 * * `growTime[i]` is the number of full days it takes the ith seed to grow after being completely planted.
 * After the last day of its growth, the flower blooms and stays bloomed forever.
 *
 * From the beginning of day 0, you can plant the seeds in any order.
 *
 * Return the earliest possible day where all seeds are blooming.
 *
 * [URL](https://leetcode.com/problems/earliest-possible-day-of-full-bloom/)
 */
object EarliestPossibleDayOfFullBloom {
    fun earliestFullBloom(plantTime: IntArray, growTime: IntArray): Int {
        val n = growTime.size

        val comparator = Comparator<Int> { i1, i2 -> growTime[i2].compareTo(growTime[i1]) }
        val indices = IntArray(n) { it }.sortedWith(comparator)

        var result = 0
        var curPlantTime = 0
        for (i in 0 until n) {
            val idx = indices[i]
            val time = curPlantTime + plantTime[idx] + growTime[idx]
            result = maxOf(result, time)
            curPlantTime += plantTime[idx]
        }
        return result
    }
}
