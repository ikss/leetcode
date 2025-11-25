package hard

/**
 * You are given two integer arrays, skill and mana, of length n and m, respectively.
 *
 * In a laboratory, n wizards must brew m potions in order. Each potion has a mana capacity `mana[j]` and must pass
 * through all the wizards sequentially to be brewed properly. The time taken by the ith wizard
 * on the jth potion is `timeij = skill[i] * mana[j]`.
 *
 * Since the brewing process is delicate, a potion must be passed to the next wizard immediately after the current
 * wizard completes their work. This means the timing must be synchronized so that each wizard begins working
 * on a potion exactly when it arrives.
 *
 * Return the minimum amount of time required for the potions to be brewed properly.
 *
 * [URL](https://leetcode.com/problems/count-the-number-of-ideal-arrays/)
 */
object FindTheMinimumAmountOfTimeToBrewPotions {
    fun minTime(skill: IntArray, mana: IntArray): Long {
        val n = skill.size
        val times = LongArray(n)

        for (j in mana.indices) {
            val potion = mana[j].toLong()
            var curTime = 0L
            for (i in 0..<n) {
                curTime = maxOf(curTime, times[i]) + skill[i] * potion
            }
            times[n - 1] = curTime
            for (i in n - 2 downTo 0) {
                times[i] = times[i + 1] - skill[i + 1] * potion
            }
        }
        return times.last()
    }
}
