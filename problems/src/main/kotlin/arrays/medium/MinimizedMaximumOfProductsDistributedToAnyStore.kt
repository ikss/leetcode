package arrays.medium

/**
 * You are given an integer n indicating there are n specialty retail stores. There are m product types of varying
 * amounts, which are given as a 0-indexed integer array quantities, where `quantities[i]` represents the number of
 * products of the ith product type.
 *
 * You need to distribute all products to the retail stores following these rules:
 *
 * A store can only be given at most one product type but can be given any amount of it.
 * After distribution, each store will have been given some number of products (possibly 0). Let x represent the
 * maximum number of products given to any store. You want x to be as small as possible, i.e., you want to minimize the
 * maximum number of products that are given to any store.
 * Return the minimum possible x.
 *
 * [URL](https://leetcode.com/problems/minimized-maximum-of-products-distributed-to-any-store/)
 */
object MinimizedMaximumOfProductsDistributedToAnyStore {
    fun minimizedMaximum(n: Int, quantities: IntArray): Int {
        var min = 1
        var max = quantities.max()

        while (min < max) {
            var mid = (max - min) / 2 + min

            if (canDistribute(n, quantities, mid)) {
                max = mid
            } else {
                min = mid + 1
            }
        }

        return min
    }

    private fun canDistribute(n: Int, quantities: IntArray, target: Int): Boolean {
        var shops = 0

        for (q in quantities) {
            val shopsNeeded = (q - 1) / target + 1
            shops += shopsNeeded
            if (shops > n) return false
        }
        return true
    }
}
