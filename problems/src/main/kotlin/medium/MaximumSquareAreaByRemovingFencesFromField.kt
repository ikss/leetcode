package medium

/**
 * There is a large (m - 1) x (n - 1) rectangular field with corners at (1, 1) and (m, n) containing some horizontal
 * and vertical fences given in arrays hFences and vFences respectively.
 *
 * Horizontal fences are from the coordinates `(hFences[i], 1)` to `(hFences[i], n)` and vertical fences are from
 * the coordinates (1, vFences[i]) to (m, vFences[i]).
 *
 * Return the maximum area of a square field that can be formed by removing some fences (possibly none)
 * or -1 if it is impossible to make a square field.
 *
 * Since the answer may be large, return it modulo 10^9 + 7.
 *
 * Note: The field is surrounded by two horizontal fences from the coordinates (1, 1) to (1, n) and (m, 1) to (m, n)
 * and two vertical fences from the coordinates (1, 1) to (m, 1) and (1, n) to (m, n). These fences cannot be removed.
 *
 * [URL](https://leetcode.com/problems/maximum-square-area-by-removing-fences-from-a-field/)
 */
object MaximumSquareAreaByRemovingFencesFromField {
    fun maximizeSquareArea(m: Int, n: Int, hFences: IntArray, vFences: IntArray): Int {
        val horizontal = hFences.toMutableList()
        horizontal.add(1)
        horizontal.add(m)

        val vertical = vFences.toMutableList()
        vertical.add(1)
        vertical.add(n)

        val horizontalDiff = HashSet<Int>()

        for (i in 0 until horizontal.size - 1) {
            for (j in i until horizontal.size) {
                horizontalDiff.add(Math.abs(horizontal[i] - horizontal[j]))
            }
        }

        var result = 0L
        for (i in 0 until vertical.size - 1) {
            for (j in i until vertical.size) {
                val diff = Math.abs(vertical[i] - vertical[j])
                if (diff in horizontalDiff) {
                    result = maxOf(result, diff.toLong() * diff)
                }
            }
        }
        return if (result == 0L) return -1 else (result % 1_000_000_007).toInt()
    }
}
