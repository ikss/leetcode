package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MostBeautifulItemForEachQueryTest {
    @Test
    fun test1() {
        val items = arrayOf(intArrayOf(1, 2), intArrayOf(3, 2), intArrayOf(2, 4), intArrayOf(5, 6), intArrayOf(3, 5))
        val queries = intArrayOf(1, 2, 3, 4, 5, 6)
        val expected = intArrayOf(2, 4, 5, 5, 6, 6)

        assertArrayEquals(expected, MostBeautifulItemForEachQuery.maximumBeauty(items, queries))
    }

    @Test
    fun test2() {
        val items = arrayOf(intArrayOf(1, 2), intArrayOf(1, 2), intArrayOf(1, 4), intArrayOf(1, 4))
        val queries = intArrayOf(1)
        val expected = intArrayOf(4)

        assertArrayEquals(expected, MostBeautifulItemForEachQuery.maximumBeauty(items, queries))
    }

    @Test
    fun test3() {
        val items = arrayOf(intArrayOf(10, 10000))
        val queries = intArrayOf(5)
        val expected = intArrayOf(0)

        assertArrayEquals(expected, MostBeautifulItemForEachQuery.maximumBeauty(items, queries))
    }

    @Test
    fun test4() {
        val items = arrayOf(intArrayOf(1, 10), intArrayOf(5, 5))
        val queries = intArrayOf(6)
        val expected = intArrayOf(10)

        assertArrayEquals(expected, MostBeautifulItemForEachQuery.maximumBeauty(items, queries))
    }
}