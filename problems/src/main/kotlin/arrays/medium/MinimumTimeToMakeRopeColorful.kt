package arrays.medium

/**
 * Alice has n balloons arranged on a rope. You are given a 0-indexed string colors where `colors[i]`
 * is the color of the ith balloon.
 *
 * Alice wants the rope to be colorful. She does not want two consecutive balloons to be of the same color,
 * so she asks Bob for help. Bob can remove some balloons from the rope to make it colorful.
 * You are given a 0-indexed integer array neededTime where `neededTime[i]` is the time (in seconds) that Bob needs
 * to remove the ith balloon from the rope.
 *
 * Return the minimum time Bob needs to make the rope colorful.
 *
 * [URL](https://leetcode.com/problems/minimum-time-to-make-rope-colorful/)
 */
object MinimumTimeToMakeRopeColorful {
    fun minCost(colors: String, neededTime: IntArray): Int {
        var oldC: Char? = null
        var max = Int.MIN_VALUE
        var runningSum = 0
        var result = 0
        for (i in colors.indices) {
            val c = colors[i]
            if (c != oldC && runningSum != 0) {
                result += runningSum - max
                max = Int.MIN_VALUE
                runningSum = 0
            }
            val time = neededTime[i]
            runningSum += time
            max = maxOf(max, time)
            oldC = c
        }
        if (runningSum != 0) {
            result += runningSum - max
        }
        return result
    }
}