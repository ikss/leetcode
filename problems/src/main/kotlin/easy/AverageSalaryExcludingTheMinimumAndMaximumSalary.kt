package easy

/**
 * You are given an array of unique integers salary where `salary[i]` is the salary of the ith employee.
 *
 * Return the average salary of employees excluding the minimum and maximum salary.
 * Answers within 10-5 of the actual answer will be accepted.
 *
 * [URL](https://leetcode.com/problems/two-sum/)
 */
object AverageSalaryExcludingTheMinimumAndMaximumSalary {
    fun average(salary: IntArray): Double {
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        var sum = 0L

        for (s in salary) {
            sum += s
            min = minOf(min, s)
            max = maxOf(max, s)
        }

        sum -= (min + max)

        return sum.toDouble() / (salary.size - 2)
    }
}
