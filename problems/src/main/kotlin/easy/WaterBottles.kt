package easy

/**
 * There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles
 * from the market with one full water bottle.
 *
 * The operation of drinking a full water bottle turns it into an empty bottle.
 *
 * Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.
 *
 * [URL](https://leetcode.com/problems/water-bottles/)
 */
object WaterBottles {
    fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
        var fullBottles = numBottles
        var result = 0
        var emptyBottles = 0

        while (fullBottles > 0) {
            result += fullBottles
            emptyBottles += fullBottles
            fullBottles = emptyBottles / numExchange
            emptyBottles %= numExchange
        }

        return result
    }
}
