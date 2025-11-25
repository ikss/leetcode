package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfThereIsValidPartitionForTheArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(4, 4, 4, 5, 6)
        val expected = true

        assertEquals(expected, CheckIfThereIsValidPartitionForTheArray.validPartition(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 1, 1, 2)
        val expected = false

        assertEquals(expected, CheckIfThereIsValidPartitionForTheArray.validPartition(nums))
    }
}