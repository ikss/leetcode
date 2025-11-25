package medium

import java.util.*

/**
 * Given an array of integers temperatures represents the daily temperatures, return an array answer
 * such that `answer[i]` is the number of days you have to wait after the ith day to get a warmer temperature.
 * If there is no future day for which this is possible, keep `answer[i] == 0` instead.
 *
 * [URL](https://leetcode.com/problems/daily-temperatures/)
 */
object DailyTemperatures {

    fun dailyTemperaturesTwoCycles(temperatures: IntArray): IntArray {
        val result = IntArray(temperatures.size)
        for (i in temperatures.indices) {
            var res = 0
            for (j in i..temperatures.size) {
                if (j == temperatures.size) {
                    res = 0
                    break
                }
                if (temperatures[j] > temperatures[i]) break
                res++
            }
            result[i] = res
        }

        return result
    }

    fun dailyTemperaturesMonotonicStack(temperatures: IntArray): IntArray {
        val stack = Stack<Int>()
        val result = IntArray(temperatures.size)
        for (i in temperatures.indices) {
            while (stack.isNotEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                val prevIndex = stack.pop()
                result[prevIndex] = i - prevIndex
            }
            stack.push(i)
        }

        return result
    }
}
