package data_structures.arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RangeSumQueryMutableTest {
    @Test
    fun test1() {
        val arr = RangeSumQueryMutable.NumArrayNaive(intArrayOf(1, 3, 5))
        assertEquals(9, arr.sumRange(0, 2))

        arr.update(1, 2)
        assertEquals(8, arr.sumRange(0, 2))
    }
}
