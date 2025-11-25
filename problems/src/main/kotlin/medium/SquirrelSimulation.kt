package medium

/**
 * You are given two integers height and width representing a garden of size height x width. You are also given:
 * * an array tree where `tree = [treer, treec]` is the position of the tree in the garden,
 * * an array squirrel where `squirrel = [squirrelr, squirrelc]` is the position of the squirrel in the garden,
 * * and an array nuts where `nuts[i] = [nutir, nutic]` is the position of the ith nut in the garden.
 *
 * The squirrel can only take at most one nut at one time and can move in four directions: up, down, left, and right,
 * to the adjacent cell.
 *
 * Return the minimal distance for the squirrel to collect all the nuts and put them under the tree one by one.
 *
 * The distance is the number of moves.
 *
 * [URL](https://leetcode.com/problems/squirrel-simulation/)
 */
object SquirrelSimulation {
    fun minDistance(height: Int, width: Int, tree: IntArray, squirrel: IntArray, nuts: Array<IntArray>): Int {
        var totalDistance = 0
        var savedDistance = Int.MIN_VALUE
        for (nut in nuts) {
            val distanceFromTree = distance(nut, tree)
            totalDistance += distanceFromTree * 2
            savedDistance = maxOf(savedDistance, distanceFromTree - distance(nut, squirrel))
        }
        return totalDistance - savedDistance
    }

    private fun distance(a: IntArray, b: IntArray): Int {
        return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1])
    }
}