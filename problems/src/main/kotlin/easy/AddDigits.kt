package easy

/**
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 *
 * [URL](https://leetcode.com/problems/add-digits/)
 */
object AddDigits {
    tailrec fun addDigitsTailrec(num: Int): Int {
        return if (num < 9) {
            num
        } else {
            var res = 0
            for (c in num.toString()) {
                res += c - '0'
            }
            addDigitsTailrec(res)
        }
    }

    fun addDigitsMath(num: Int): Int {
        return if (num == 0) 0 else 1 + (num - 1) % 9
    }
}
