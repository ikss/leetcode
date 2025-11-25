package medium

/**
 * You are visiting a farm that has a single row of fruit trees arranged from left to right.
 * The trees are represented by an integer array fruits where `fruits[i]` is the type of fruit the ith tree produces.
 *
 * You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
 *
 * You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount
 * of fruit each basket can hold.
 * Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree)
 * while moving to the right. The picked fruits must fit in one of your baskets.
 * Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
 * Given the integer array fruits, return the maximum number of fruits you can pick.
 *
 * [URL](https://leetcode.com/problems/fruit-into-baskets/)
 */
object FruitIntoBaskets {
    fun totalFruitSlidingWindow(fruits: IntArray): Int {
        val basket = HashMap<Int, Int>()
        var left = 0
        var result = 0

        for (right in fruits.indices) {
            val fruitRight = fruits[right]
            basket[fruitRight] = basket.getOrDefault(fruitRight, 0) + 1

            while (basket.size > 2) {
                val fruitLeft = fruits[left]
                basket[fruitLeft] = basket[fruitLeft]!! - 1
                if (basket[fruitLeft] == 0) {
                    basket.remove(fruitLeft)
                }
                left++
            }

            result = maxOf(result, right - left + 1)
        }

        return result
    }

    fun totalFruitNaive(fruits: IntArray): Int {
        var result = 0
        for (i in fruits.indices) {
            result = maxOf(result, calculate(fruits, i))
        }
        return result
    }

    private fun calculate(fruits: IntArray, index: Int): Int {
        var result = 0
        val picked = hashSetOf<Int>()

        for (i in index until fruits.size) {
            if (picked.size == 2 && picked.add(fruits[i])) {
                break
            }
            picked.add(fruits[i])
            result++
        }

        return result
    }
}
