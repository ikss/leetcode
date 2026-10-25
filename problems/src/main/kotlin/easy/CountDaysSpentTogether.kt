package easy

/**
 * Alice and Bob are traveling to Rome for separate business meetings.
 *
 * You are given 4 strings arriveAlice, leaveAlice, arriveBob, and leaveBob.
 * Alice will be in the city from the dates arriveAlice to leaveAlice (inclusive),
 * while Bob will be in the city from the dates arriveBob to leaveBob (inclusive).
 * Each will be a 5-character string in the format "MM-DD", corresponding to the month and day of the date.
 *
 * Return the total number of days that Alice and Bob are in Rome together.
 *
 * You can assume that all dates occur in the same calendar year, which is not a leap year.
 * Note that the number of days per month can be represented as: `[31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]`.
 *
 * [URL](https://leetcode.com/problems/count-days-spent-together/)
 */
object CountDaysSpentTogether {

    private val daysByMonth = intArrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    private val daysAccumulated = IntArray(13)

    fun countDaysTogether(arriveAlice: String, leaveAlice: String, arriveBob: String, leaveBob: String): Int {
        for (i in 1 until daysAccumulated.size) {
            daysAccumulated[i] = daysAccumulated[i - 1] + daysByMonth[i]
        }
        val aa = getDayOfTheYear(arriveAlice)
        val la = getDayOfTheYear(leaveAlice)
        val ab = getDayOfTheYear(arriveBob)
        val lb = getDayOfTheYear(leaveBob)

        if (aa > lb || ab > la) return 0

        return minOf(la, lb) - maxOf(aa, ab) + 1
    }

    private fun getDayOfTheYear(date: String): Int {
        val month = date.substring(0, 2).toInt()
        val day = date.substring(3).toInt()

        val result = day + daysAccumulated[month-1]
        return result
    }
}