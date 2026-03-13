package medium

/**
 * You are given an integer mountainHeight denoting the height of a mountain.
 *
 * You are also given an integer array workerTimes representing the work time of workers in seconds.
 *
 * The workers work simultaneously to reduce the height of the mountain. For worker i:
 *
 * To decrease the mountain's height by x,
 * it takes `workerTimes[i] + workerTimes[i] * 2 + ... + workerTimes[i] * x seconds`. For example:
 * * To reduce the height of the mountain by 1, it takes `workerTimes[i]` seconds.
 * * To reduce the height of the mountain by 2, it takes `workerTimes[i] + workerTimes[i] * 2` seconds, and so on.
 *
 * Return an integer representing the minimum number of seconds required for the workers to make the height of the mountain 0.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-seconds-to-make-mountain-height-zero/)
 */
object MinimumNumberOfSecondsToMakeMountainHeightZero {
    fun minNumberOfSeconds(mountainHeight: Int, workerTimes: IntArray): Long {
        var left = 1L
        var right = workerTimes.max().toLong() * mountainHeight * (mountainHeight + 1) / 2

        var result = 0L
        while (left <= right) {
            val mid = left + (right - left) / 2
            val canDecrease = canDecrease(mountainHeight, workerTimes, mid)

            if (canDecrease) {
                result = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        return result
    }

    private fun canDecrease(mountainHeigh: Int, workerTimes: IntArray, seconds: Long): Boolean {
        var sum = 0L

        for (w in workerTimes) {
            val work = seconds / w
            val k = ((-1.0 + Math.sqrt(1.0 + work * 8)) / 2 + 1e-7).toLong()
            sum += k
            if (sum >= mountainHeigh) return true
        }
        return false
    }
}
