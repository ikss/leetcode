package math.hard

/**
 * Given n orders, each order consist in pickup and delivery services.
 *
 * Count all valid pickup/delivery possible sequences such that delivery(i) is always after of pickup(i).
 *
 * Since the answer may be too large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/count-all-valid-pickup-and-delivery-options/)
 */
object CountAllValidPickupAndDeliveryOptions {
    private const val MOD = 1_000_000_007

    fun countOrders(n: Int): Int {
        var result = 1L
        for (i in 1..n) {
            result = result * (i * 2 - 1) * i % MOD
        }
        return result.toInt()
    }
}
