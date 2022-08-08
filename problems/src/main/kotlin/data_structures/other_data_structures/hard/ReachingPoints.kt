package data_structures.other_data_structures.hard

/**
 * Given four integers sx, sy, tx, and ty, return true if it is possible to convert the point (sx, sy)
 * to the point (tx, ty) through some operations, or false otherwise.
 *
 * The allowed operation on some point (x, y) is to convert it to either (x, x + y) or (x + y, y).
 *
 * [URL](https://leetcode.com/problems/reaching-points/)
 */
object ReachingPoints {
    fun reachingPoints(sx: Int, sy: Int, tx: Int, ty: Int): Boolean {
        var tx = tx
        var ty = ty
        while (sx < tx && sy < ty) {
            if (tx < ty) {
                ty %= tx
            } else {
                tx %= ty
            }
        }
        println("sx = [${sx}], sy = [${sy}], tx = [${tx}], ty = [${ty}]")
        return if (sx == tx && sy <= ty && (ty - sy) % sx == 0) {
            true
        } else {
            sy == ty && sx <= tx && (tx - sx) % sy == 0
        }
    }
}
