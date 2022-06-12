package monthly_challenge.may_2020.week4

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

object ContiguousArrayTest {

    @Test
    fun test1() {
        val array = intArrayOf(0, 1)
        assertEquals(2, ContiguousArray.findMaxLength(array))
    }

    @Test
    fun test2() {
        val array = intArrayOf(0, 1, 0)
        assertEquals(2, ContiguousArray.findMaxLength(array))
    }

    @Test
    fun test3() {
        val array = intArrayOf(1, 0, 1, 1, 1, 0, 0)
        assertEquals(6, ContiguousArray.findMaxLength(array))
    }
}
