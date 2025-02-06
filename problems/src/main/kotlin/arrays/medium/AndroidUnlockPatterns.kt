package arrays.medium

/**
 * Android devices have a special lock screen with a 3 x 3 grid of dots. Users can set an "unlock pattern" by connecting
 * the dots in a specific sequence, forming a series of joined line segments where each segment's endpoints are two
 * consecutive dots in the sequence. A sequence of k dots is a valid unlock pattern if both of the following are true:
 * * All the dots in the sequence are distinct.
 * * If the line segment connecting two consecutive dots in the sequence passes through the center of any other dot, the
 * other dot must have previously appeared in the sequence. No jumps through the center non-selected dots are allowed.
 * * * For example, connecting dots 2 and 9 without dots 5 or 6 appearing beforehand is valid because the line from dot
 * 2 to dot 9 does not pass through the center of either dot 5 or 6.
 * * * However, connecting dots 1 and 3 without dot 2 appearing beforehand is invalid because the line from dot 1 to dot
 * 3 passes through the center of dot 2.
 *
 * [URL](https://leetcode.com/problems/android-unlock-patterns/)
 */
object AndroidUnlockPatterns {
    private val jump = Array(10) { IntArray(10) }

    init {
        jump[1][3] = 2
        jump[4][6] = 5
        jump[7][9] = 8
        jump[1][7] = 4
        jump[2][8] = 5
        jump[3][9] = 6
        jump[1][9] = 5
        jump[3][7] = 5
    }

    fun numberOfPatterns(m: Int, n: Int): Int {
        val validPatternsFrom1 = traverse(hashSetOf(1), 1, m, n)
        val validPatternsFrom2 = traverse(hashSetOf(2), 2, m, n)
        val validPatternsFrom5 = traverse(hashSetOf(5), 5, m, n)

        return 4 * (validPatternsFrom1 + validPatternsFrom2) + validPatternsFrom5
    }

    private fun traverse(state: HashSet<Int>, prev: Int, m: Int, n: Int): Int {
        if (state.size > n) return 0

        var result = if (state.size >= m) 1 else 0

        for (i in 1 .. 9) {
            if (!state.add(i)) continue

            if (prev == 5 || isDiagonalInside(prev, i, state)) {
                result += traverse(state, i, m, n)
            }
            state.remove(i)
        }

        return result
    }

    private fun isDiagonalInside(prev: Int, curr: Int, state: HashSet<Int>): Boolean {
        val (min, max) = if (prev >= curr) curr to prev else prev to curr

        return jump[min][max] == 0 || state.contains(jump[min][max])
    }
}
