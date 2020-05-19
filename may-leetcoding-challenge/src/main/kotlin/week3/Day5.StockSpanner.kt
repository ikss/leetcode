package week3

import java.util.*

class StockSpanner {
    private val values = LinkedList<Pair<Int, Int>>()

    fun next(price: Int): Int {
        var result = 1
        while (values.isNotEmpty() && values.peek().first <= price) {
            result += values.poll().second
        }
        values.push(price to result)
        return result
    }
}
