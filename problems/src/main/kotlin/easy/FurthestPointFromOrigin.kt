package easy

/**
 * You are given a string moves of length n consisting only of characters 'L', 'R', and '_'.
 * The string represents your movement on a number line starting from the origin 0.
 *
 * In the ith move, you can choose one of the following directions:
 * * move to the left if `moves[i] = 'L'` or `moves[i] = '_'`
 * * move to the right if `moves[i] = 'R'` or `moves[i] = '_'`
 * Return the distance from the origin of the furthest point you can get to after n moves.
 *
 * [URL](https://leetcode.com/problems/furthest-point-from-origin/)
 */
object FurthestPointFromOrigin {
    fun furthestDistanceFromOrigin(moves: String): Int {
        var countUnderscores = 0
        var countLeft = 0
        var countRight = 0

        for (m in moves) {
            when (m) {
                '_' -> countUnderscores++
                'L' -> countLeft++
                'R' -> countRight++
            }
        }

        return Math.abs(countLeft - countRight) + countUnderscores
    }
}
