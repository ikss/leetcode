package arrays.easy

/**
 * You are given a 0-indexed integer array nums of size 3 which can form the sides of a triangle.
 *
 * A triangle is called equilateral if it has all sides of equal length.
 * A triangle is called isosceles if it has exactly two sides of equal length.
 * A triangle is called scalene if all its sides are of different lengths.
 * Return a string representing the type of triangle that can be formed or "none" if it cannot form a triangle.
 *
 * [URL](https://leetcode.com/problems/type-of-triangle/)
 */
object TypeOfTriangle {
    fun triangleType(nums: IntArray): String {
        val (first, second, third) = nums

        if (first + second <= third || first + third <= second || second + third <= first) {
            return "none"
        }
        val set = HashSet<Int>()
        set.add(first)
        set.add(second)
        set.add(third)

        return when (set.size) {
            1 -> "equilateral"
            2 -> "isosceles"
            else -> "scalene"
        }
    }
}
