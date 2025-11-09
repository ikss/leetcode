package numbers.easy

/**
 * You are given two non-negative integers num1 and num2.
 *
 * In one operation, if num1 >= num2, you must subtract num2 from num1, otherwise subtract num1 from num2.
 * * For example, if num1 = 5 and num2 = 4, subtract num2 from num1, thus obtaining num1 = 1 and num2 = 4.
 * However, if num1 = 4 and num2 = 5, after one operation, num1 = 4 and num2 = 1.
 *
 * Return the number of operations required to make either num1 = 0 or num2 = 0.
 *
 * [URL](https://leetcode.com/problems/count-operations-to-obtain-zero/)
 */
object CountOperationsToObtainZero {
    // Euclidean algorithm
    fun countOperations(num1: Int, num2: Int): Int {
        var n1 = num1
        var n2 = num2
        var result = 0

        while (n1 != 0 && n2 != 0) {
            // each step of the Euclidean algorithm
            result += n1 / n2
            n1 %= n2
            // swap two numbers
            val temp = n1
            n1 = n2
            n2 = temp
        }
        return result
    }
}