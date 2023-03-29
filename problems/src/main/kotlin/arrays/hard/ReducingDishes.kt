package arrays.hard

/**
 * A chef has collected data on the satisfaction level of his n dishes. Chef can cook any dish in 1 unit of time.
 *
 * Like-time coefficient of a dish is defined as the time taken to cook that dish including previous dishes multiplied
 * by its satisfaction level i.e. `time[i] * satisfaction[i]`.
 *
 * Return the maximum sum of like-time coefficient that the chef can obtain after dishes preparation.
 *
 * Dishes can be prepared in any order and the chef can discard some dishes to get this maximum value.
 *
 * [URL](https://leetcode.com/problems/reducing-dishes/)
 */
object ReducingDishes {
    private var result: Int = 0

    fun maxSatisfactionNaive(satisfaction: IntArray): Int {
        result = 0
        val size = satisfaction.size

        satisfaction.sort()

        if (satisfaction[size - 1] <= 0) return 0

        backtrack(satisfaction, 0, 1, 0)
        return result
    }

    private fun backtrack(satisfaction: IntArray, currSum: Int, currStep: Int, currDish: Int) {
        if (currDish == satisfaction.size) {
            result = maxOf(currSum, result)
        }

        for (i in currDish until satisfaction.size) {
            if (satisfaction[currDish] <= 0) {
                backtrack(satisfaction, currSum, currStep, i + 1)
            }
            backtrack(satisfaction, currSum + satisfaction[currDish] * currStep, currStep + 1, i + 1)
        }
    }


    fun maxSatisfactionGreedy(satisfaction: IntArray): Int {
        satisfaction.sort()
        var result = 0
        var suffixSum = 0

        for (i in satisfaction.size - 1 downTo 0) {
            if (suffixSum + satisfaction[i] <= 0) {
                break
            }
            suffixSum += satisfaction[i]
            result += suffixSum
        }
        return result
    }
}