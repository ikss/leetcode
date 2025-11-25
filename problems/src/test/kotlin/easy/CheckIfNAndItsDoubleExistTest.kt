package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfNAndItsDoubleExistTest {
    @Test
    fun test1() {
        val arr = intArrayOf(10, 2, 5, 3)
        val expected = true

        assertEquals(expected, CheckIfNAndItsDoubleExist.checkIfExist(arr))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(3, 1, 7, 11)
        val expected = false

        assertEquals(expected, CheckIfNAndItsDoubleExist.checkIfExist(arr))
    }
}