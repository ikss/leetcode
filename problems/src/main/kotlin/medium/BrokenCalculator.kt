package medium

/**
 * There is a broken calculator that has the integer startValue on its display initially. In one operation, you can:
 * * multiply the number on display by 2, or
 * * subtract 1 from the number on display.
 *
 * Given two integers startValue and target, return the minimum number of operations needed to display target on the calculator.
 *
 * [URL](https://leetcode.com/problems/broken-calculator/)
 */
object BrokenCalculator {
    fun brokenCalc(startValue: Int, target: Int): Int {
        var target = target
        var result = 0
        while (target > startValue) {
            result++
            if (target % 2 == 1) target++ else target /= 2
        }
        return result + startValue - target
    }
}
