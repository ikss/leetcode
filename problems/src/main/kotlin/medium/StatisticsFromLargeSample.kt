package medium

/**
 * You are given a large sample of integers in the range `[0, 255]`. Since the sample is so large,
 * it is represented by an array count where `count[k]` is the number of times that k appears in the sample.
 *
 * Calculate the following statistics:
 *
 * * minimum: The minimum element in the sample.
 * * maximum: The maximum element in the sample.
 * * mean: The average of the sample, calculated as the total sum of all elements divided by the total number of
 * elements.
 * * median:
 * * * If the sample has an odd number of elements, then the median is the middle element once the sample is sorted.
 * * * If the sample has an even number of elements, then the median is the average of the two middle elements once
 * the sample is sorted.
 * * mode: The number that appears the most in the sample. It is guaranteed to be unique.
 * Return the statistics of the sample as an array of floating-point numbers [minimum, maximum, mean, median, mode].
 * Answers within 10-5 of the actual answer will be accepted.
 *
 * [URL](https://leetcode.com/problems/statistics-from-a-large-sample/)
 */
object StatisticsFromLargeSample {
    fun sampleStats(count: IntArray): DoubleArray {
        var min = -1.0
        var max = 0.0
        var mode = 0.0
        var median = 0.0
        var mean = 0.0

        var meanCount = 0
        var modeCount = 0

        for (i in count.indices) {
            val countNum = count[i]
            if (countNum == 0) continue

            val num = i

            max = num.toDouble()
            if (min == -1.0) {
                min = max
            }

            mean = (meanCount * mean + countNum * max) / (meanCount + countNum)
            meanCount += countNum
            if (countNum > modeCount) {
                mode = max
                modeCount = countNum
            }
        }

        var l = 0
        var lcount = 0
        var rcount = 0
        var r = count.size - 1

        while (l <= r) {
            if (count[l] == 0) {
                l++
                continue
            }
            if (count[r] == 0) {
                r--
                continue
            }
            lcount = if (lcount > 0) lcount else count[l]
            rcount = if (rcount > 0) rcount else count[r]
            if (lcount > rcount) {
                lcount -= rcount
                rcount = 0
                r--
                median = l.toDouble()
            } else if (lcount < rcount) {
                rcount -= lcount
                lcount = 0
                l++
                median = r.toDouble()
            } else {
                lcount = 0
                rcount = 0
                median = r.toDouble() / 2 + l.toDouble() / 2
                l++
                r--
            }
        }

        return doubleArrayOf(min, max, mean, median, mode)
    }

}