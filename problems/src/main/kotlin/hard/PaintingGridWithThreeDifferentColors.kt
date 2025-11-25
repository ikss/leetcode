package hard

import kotlin.math.pow

/**
 * You are given two integers m and n. Consider an m x n grid where each cell is initially white.
 * You can paint each cell red, green, or blue. All cells must be painted.
 *
 * Return the number of ways to color the grid with no two adjacent cells having the same color.
 * Since the answer can be very large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/painting-a-grid-with-three-different-colors/)
 */
object PaintingGridWithThreeDifferentColors {

    fun colorTheGrid(m: Int, n: Int): Int {
        val mod = 1_000_000_007
        // Hash mapping stores all valid coloration schemes for a single row that meet the requirements
        val valid = HashMap<Int, MutableList<Int>>()

        // Enumerate masks that meet the requirements within the range [0, 3^m)
        val maskEnd = 3.0.pow(m.toDouble()).toInt()
        for (mask in 0..<maskEnd) {
            val color = ArrayList<Int>()
            var mm = mask
            for (i in 0..<m) {
                color.add(mm % 3)
                mm /= 3
            }
            var check = true
            for (i in 0..<m - 1) {
                if (color[i] == color[i + 1]) {
                    check = false
                    break
                }
            }
            if (check) {
                valid.put(mask, color)
            }
        }

        // Preprocess all (mask1, mask2) binary tuples, satisfying mask1 and mask2 When adjacent rows,
        // the colors of the two cells in the same column are different
        val adjacent = HashMap<Int, ArrayList<Int>>()
        for (mask1 in valid.keys) {
            for (mask2 in valid.keys) {
                var check = true
                for (i in 0..<m) {
                    if (valid.get(mask1)!![i] == valid.get(mask2)!![i]) {
                        check = false
                        break
                    }
                }
                if (check) {
                    adjacent.computeIfAbsent(mask1) { k -> ArrayList() }.add(mask2)
                }
            }
        }

        var f = HashMap<Int, Int>()
        for (mask in valid.keys) {
            f[mask] = 1
        }
        for (i in 1..<n) {
            val g = HashMap<Int, Int>()
            for (mask2 in valid.keys) {
                for (mask1 in adjacent.getOrDefault(mask2, ArrayList())) {
                    g[mask2] = (g.getOrDefault(mask2, 0) + f.getOrDefault(mask1, 0)) % mod
                }
            }
            f = g
        }

        var ans = 0
        for (num in f.values) {
            ans = (ans + num) % mod
        }
        return ans
    }
}
