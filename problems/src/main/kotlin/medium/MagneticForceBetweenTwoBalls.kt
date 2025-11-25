package medium

/**
 * In the universe Earth C-137, Rick discovered a special form of magnetic force between two balls if they are put in
 * his new invented basket. Rick has n empty baskets, the ith basket is at `position[i]`, Morty has m balls and needs to
 * distribute the balls into the baskets such that the minimum magnetic force between any two balls is maximum.
 *
 * Rick stated that magnetic force between two different balls at positions x and y is |x - y|.
 *
 * Given the integer array position and the integer m. Return the required force.
 *
 * [URL](https://leetcode.com/problems/magnetic-force-between-two-balls/)
 */
object MagneticForceBetweenTwoBalls {
    fun maxDistance(position: IntArray, m: Int): Int {
        val n = position.size
        position.sort()

        var result = 0
        var low = 1
        var high = Math.ceil(position[n - 1] / (m - 1.0)).toInt()
        while (low <= high) {
            val mid = low + (high - low) / 2
            if (canPlaceBalls(mid, position, m)) {
                result = mid
                low = mid + 1
            } else {
                high = mid - 1
            }
        }
        return result
    }

    private fun canPlaceBalls(x: Int, position: IntArray, m: Int): Boolean {
        var prevBallPos = position[0]
        var ballsPlaced = 1

        for (i in 1 until position.size) {
            val currPos = position[i]
            
            // Check if we can place the ball at the current position.
            if (currPos - prevBallPos >= x) {
                ballsPlaced += 1
                if (ballsPlaced == m) return true
                prevBallPos = currPos
            }
        }
        return false
    }
}
