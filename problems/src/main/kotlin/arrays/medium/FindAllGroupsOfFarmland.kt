package arrays.medium

/**
 * You are given a 0-indexed m x n binary matrix land where a 0 represents a hectare of forested land and a 1 represents a hectare of farmland.
 *
 * To keep the land organized, there are designated rectangular areas of hectares that consist entirely of farmland.
 * These rectangular areas are called groups. No two groups are adjacent, meaning farmland in one group is not four-directionally adjacent to another farmland in a different group.
 *
 * land can be represented by a coordinate system where the top left corner of land is (0, 0)
 * and the bottom right corner of land is (m-1, n-1). Find the coordinates of the top left and bottom right corner
 * of each group of farmland. A group of farmland with a top left corner at (r1, c1) and a bottom right corner
 * at (r2, c2) is represented by the 4-length array [r1, c1, r2, c2].
 *
 * Return a 2D array containing the 4-length arrays described above for each group of farmland in land.
 * If there are no groups of farmland, return an empty array. You may return the answer in any order.
 *
 * [URL](https://leetcode.com/problems/find-all-groups-of-farmland/)
 */
object FindAllGroupsOfFarmland {
    fun findFarmland(land: Array<IntArray>): Array<IntArray> {
        val result = ArrayList<IntArray>()

        for (i in land.indices) {
            for (j in land[0].indices) {
                if (land[i][j] == 0) continue

                val array = intArrayOf(i, j, i, j)
                land[i][j] = 0
                while (array[2] + 1 in land.indices && land[array[2] + 1][array[3]] == 1) {
                    array[2]++
                }
                while (array[3] + 1 in land[0].indices && land[array[2]][array[3] + 1] == 1) {
                    array[3]++
                }

                for (m in array[0]..array[2]) {
                    for (n in array[1]..array[3]) {
                        land[m][n] = 0
                    }
                }

                result.add(array)
            }
        }

        return result.toTypedArray()
    }
}