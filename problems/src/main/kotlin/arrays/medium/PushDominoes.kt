package arrays.medium

/**
 * There are n dominoes in a line, and we place each domino vertically upright.
 * In the beginning, we simultaneously push some of the dominoes either to the left or to the right.
 *
 * After each second, each domino that is falling to the left pushes the adjacent domino on the left.
 * Similarly, the dominoes falling to the right push their adjacent dominoes standing on the right.
 *
 * When a vertical domino has dominoes falling on it from both sides, it stays still due to the balance of the forces.
 *
 * For the purposes of this question, we will consider that a falling domino expends no additional force
 * to a falling or already fallen domino.
 *
 * You are given a string dominoes representing the initial state where:
 * * `dominoes[i] = 'L'`, if the ith domino has been pushed to the left,
 * * `dominoes[i] = 'R'`, if the ith domino has been pushed to the right, and
 * * `dominoes[i] = '.'`, if the ith domino has not been pushed.
 *
 * Return a string representing the final state.
 *
 * [URL](https://leetcode.com/problems/01-matrix/)
 */
object PushDominoes {
    fun pushDominoes(dominoes: String): String? {
        val length = dominoes.length
        val forces = IntArray(length)

        // Populate forces going from left to right
        var force = 0
        for (i in 0 until length) {
            force = if (dominoes[i] == 'R') length else if (dominoes[i] == 'L') 0 else maxOf(force - 1, 0)
            forces[i] += force
        }
        println(forces.contentToString())
        // Populate forces going from right to left
        force = 0
        for (i in length - 1 downTo 0) {
            force = if (dominoes[i] == 'L') length else if (dominoes[i] == 'R') 0 else maxOf(force - 1, 0)
            forces[i] -= force
        }
        println(forces.contentToString())

        val result = CharArray(length)
        for (i in 0 until length) {
            val force = forces[i]
            result[i] = when {
                force > 0 -> 'R'
                force < 0 -> 'L'
                else -> '.'
            }
        }
        return String(result)
    }
}
