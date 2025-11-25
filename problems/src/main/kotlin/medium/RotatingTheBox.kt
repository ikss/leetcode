package medium

/**
 * You are given an m x n matrix of characters box representing a side-view of a box.
 * Each cell of the box is one of the following:
 * * A stone '#'
 * * A stationary obstacle '*'
 * * Empty '.'
 *
 * The box is rotated 90 degrees clockwise, causing some of the stones to fall due to gravity.
 * Each stone falls down until it lands on an obstacle, another stone, or the bottom of the box.
 * Gravity does not affect the obstacles' positions, and the inertia from the box's rotation does not affect the stones'
 * horizontal positions.
 *
 * It is guaranteed that each stone in box rests on an obstacle, another stone, or the bottom of the box.
 *
 * Return an n x m matrix representing the box after the rotation described above.
 *
 * [URL](https://leetcode.com/problems/arithmetic-subarrays/)
 */
object RotatingTheBox {
    fun rotateTheBox(box: Array<CharArray>): Array<CharArray> {
        val m = box.size
        val n = box[0].size
        val result = Array(n) { CharArray(m) { '.' } }

        for (br in box.indices) {
            for (bc in box[0].indices) {
                result[bc][result[0].size - 1 - br] = box[br][bc]
            }
        }

        for (c in result[0].indices) {
            val prevEmpty = java.util.ArrayDeque<Int>()
            for (r in result.size - 1 downTo 0) {
                when (result[r][c]) {
                    '#' -> {
                        if (prevEmpty.isEmpty()) continue
                        result[r][c] = '.'
                        result[prevEmpty.poll()][c] = '#'
                        prevEmpty.offer(r)
                    }
                    '*' -> {
                        prevEmpty.clear()
                    }
                    else -> prevEmpty.offer(r)
                }
            }
        }

        return result
    }
}
