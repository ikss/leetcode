package math.medium

/**
 * There is a special square room with mirrors on each of the four walls.
 * Except for the southwest corner, there are receptors on each of the remaining corners, numbered 0, 1, and 2.
 *
 * The square room has walls of length p and a laser ray from the southwest corner first meets the east wall
 * at a distance q from the 0th receptor.
 *
 * Given the two integers p and q, return the number of the receptor that the ray meets first.
 *
 * The test cases are guaranteed so that the ray will meet a receptor eventually.
 *
 * [URL](https://leetcode.com/problems/mirror-reflection/)
 */
object MirrorReflection {
    fun mirrorReflection(p: Int, q: Int): Int {
        var x = p
        var y = q

        while (y % p != 0) {
            y += q
            x += p
        }

        x %= 2 * p
        y %= 2 * p
        return when {
            x == 0 -> 2
            y == 0 -> 0
            else -> 1
        }
    }
}
