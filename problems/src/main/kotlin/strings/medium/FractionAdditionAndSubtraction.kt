package strings.medium

import java.util.*

/**
 * Given a string expression representing an expression of fraction addition and subtraction,
 * return the calculation result in string format.
 *
 * The final result should be an irreducible fraction. If your final result is an integer, change it to the format of a
 * fraction that has a denominator 1. So in this case, 2 should be converted to 2/1.
 *
 * [URL](https://leetcode.com/problems/fraction-addition-and-subtraction/)
 */
object FractionAdditionAndSubtraction {
    fun fractionAddition(expression: String): String {
        val stack = Stack<Pair<Int, Int>>()

        val reader = StringBuilder()
        var i = 0
        while (i < expression.length) {
            while (expression[i] != '/') {
                reader.append(expression[i])
                i++
            }
            i++
            val nom = reader.toString().toInt()
            reader.setLength(0)

            while (i < expression.length && expression[i].isDigit()) {
                reader.append(expression[i])
                i++
            }
            val denom = reader.toString().toInt()
            reader.setLength(0)
            stack.push(nom to denom)
        }

        var (currNom, currDenom) = stack.pop()
        while (stack.isNotEmpty()) {
            val (nextNom, nextDenom) = stack.pop()
            if (currDenom == nextDenom) {
                currNom += nextNom
            } else {
                currNom = currNom * nextDenom + nextNom * currDenom
                currDenom *= nextDenom
            }
            if (currNom == 0) currDenom = 1
        }
        val gcd = Math.abs(gcd(currNom, currDenom))

        if (gcd > 1) {
            currNom /= gcd
            currDenom /= gcd
        }
        return "$currNom/$currDenom"
    }

    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}