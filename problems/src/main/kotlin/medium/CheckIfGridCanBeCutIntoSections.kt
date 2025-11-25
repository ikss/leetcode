package medium

/**
 * You are given an integer n representing the dimensions of an n x n grid, with the origin at the bottom-left corner
 * of the grid. You are also given a 2D array of coordinates rectangles, where `rectangles[i]` is in the form
 * `[startx, starty, endx, endy]`, representing a rectangle on the grid. Each rectangle is defined as follows:
 * * (startx, starty): The bottom-left corner of the rectangle.
 * * (endx, endy): The top-right corner of the rectangle.
 *
 * Note that the rectangles do not overlap. Your task is to determine if it is possible to make either two horizontal
 * or two vertical cuts on the grid such that:
 * * Each of the three resulting sections formed by the cuts contains at least one rectangle.
 * * Every rectangle belongs to exactly one section.
 *
 * Return true if such cuts can be made; otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/average-waiting-time/)
 */
object CheckIfGridCanBeCutIntoSections {
    fun checkValidCuts(n: Int, rectangles: Array<IntArray>): Boolean {
        return checkX(rectangles) || checkY(rectangles)
    }

    private fun checkX(rectangles: Array<IntArray>): Boolean {
        rectangles.sortBy { it[0] }
        var possibleCuts = 0

        var prevEndX = rectangles[0][2]
        for (i in 1 until rectangles.size) {
            val (currStartX, _, currEndX, _) = rectangles[i]

            if (currStartX >= prevEndX) {
                possibleCuts++
            }
            prevEndX = maxOf(currEndX, prevEndX)
        }

        return possibleCuts >= 2
    }

    private fun checkY(rectangles: Array<IntArray>): Boolean {
        rectangles.sortBy { it[1] }
        var possibleCuts = 0

        var prevEndY = rectangles[0][3]
        for (i in 1 until rectangles.size) {
            val (_, currStartY, _, currEndY) = rectangles[i]

            if (currStartY >= prevEndY) {
                possibleCuts++
            }
            prevEndY = maxOf(currEndY, prevEndY)
        }

        return possibleCuts >= 2
    }
}
