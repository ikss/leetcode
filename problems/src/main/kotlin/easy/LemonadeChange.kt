package easy

/**
 * At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to buy from you and order
 * one at a time (in the order specified by bills). Each customer will only buy one lemonade and pay with
 * either a $5, $10, or $20 bill. You must provide the correct change to each customer so that the net transaction
 * is that the customer pays $5.
 *
 * Note that you do not have any change in hand at first.
 *
 * Given an integer array bills where `bills[i]` is the bill the ith customer pays, return true if you can provide every
 * customer with the correct change, or false otherwise.
 *
 * [URL](https://leetcode.com/problems/binary-search/)
 */
object LemonadeChange {
    fun lemonadeChange(bills: IntArray): Boolean {
        var fifths = 0
        var tenth = 0

        for (b in bills) {
            var change = b - 5

            if (change == 15 && tenth > 0) {
                tenth--
                change = 5
            }
            if (change / 5 > fifths) return false
            fifths -= change / 5
            if (fifths < 0) return false
            if (b == 5) fifths++
            if (b == 10) tenth++
        }

        return true
    }
}
