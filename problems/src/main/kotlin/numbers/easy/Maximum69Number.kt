package numbers.easy

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * [URL](https://leetcode.com/problems/maximum-69-number/)
 */
object Maximum69Number {
    fun maximum69NumberStringConversion(num: Int): Int {
        return num.toString().replaceFirst('6', '9').toInt()
    }

    fun maximum69Number(num: Int): Int {
        val left6 = findLeft6(num)
        return num + left6
    }

    private fun findLeft6(num: Int): Int {
        var pos = 0
        var pos6 = -1
        var num = num
        while (num > 0) {
            val rem = num % 10
            num /= 10
            if (rem == 6) {
                pos6 = pos
            }
            pos++
        }
        if (pos6 == -1) return 0

        return 3 * Math.pow(10.0, pos6.toDouble()).toInt()
    }
}
