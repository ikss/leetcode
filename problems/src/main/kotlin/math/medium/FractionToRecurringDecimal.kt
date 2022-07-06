package math.medium

/**
 * Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.
 *
 * If the fractional part is repeating, enclose the repeating part in parentheses.
 *
 * If multiple answers are possible, return any of them.
 *
 * It is guaranteed that the length of the answer string is less than 104 for all the given inputs.
 *
 * [URL](https://leetcode.com/problems/fraction-to-recurring-decimal/)
 */
object FractionToRecurringDecimal {
    fun fractionToDecimal(numerator: Int, denominator: Int): String {
        if (numerator == 0) {
            return "0"
        }
        val sign = if ((numerator > 0) == (denominator > 0)) "" else "-"
        val num = Math.abs(numerator.toLong())
        val den = Math.abs(denominator.toLong())
        return sign + num / den + fraction(num % den, den)
    }

    private fun fraction(numerator: Long, denominator: Long): String {
        if (numerator == 0L) {
            return ""
        }
        var numerator = numerator
        val res = StringBuilder(".")
        val map = mutableMapOf<Long, Int>()
        map[numerator] = res.length

        while (numerator != 0L) {
            numerator *= 10
            res.append(numerator / denominator)
            numerator %= denominator

            //If the same numerator is observed before
            // Add the brackets to index where that numerator was observed

            val index = map[numerator]
            if (index != null) {
                res.insert(index, '(')
                res.append(')')
                break
            }
            map[numerator] = res.length
        }
        return res.toString()
    }
}
