package easy

/**
 * Given a positive integer num, return true if num is a perfect square or false otherwise.
 *
 * A **perfect square** is an integer that is the square of an integer.
 * In other words, it is the product of some integer with itself.
 *
 * You must not use any built-in library function, such as sqrt.
 *
 * [URL](https://leetcode.com/problems/valid-perfect-square/)
 */
object ValidPerfectSquare {
    fun isPerfectSquareBinarySearch(num: Int): Boolean {
        var min = 1
        var max = num
        while (min <= max) {
            val mid = (max - min) / 2 + min
            val square = mid.toLong() * mid
            if (square == num.toLong()) {
                return true
            } else if (square < num.toLong()) {
                min = mid + 1
            } else {
                max = mid - 1
            }
        }
        return false
    }
    fun isPerfectSquareNewtonAlgorithm(num: Int): Boolean {
        if (num < 2) return true

        var x = (num / 2).toLong()
        while (x * x > num) {
            x = (x + num / x) / 2
        }
        return x * x == num.toLong()
    }
}