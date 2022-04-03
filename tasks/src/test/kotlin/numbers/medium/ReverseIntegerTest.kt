package numbers.medium

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReverseIntegerTest {

    @Test
    fun test1() {
        val int = 123
        val excepted = 321
        assertEquals(excepted, ReverseInteger.reverse(int))
    }

    @Test
    fun test2() {
        val int = -123
        val excepted = -321
        assertEquals(excepted, ReverseInteger.reverse(int))
    }

    @Test
    fun test3() {
        val int = 120
        val excepted = 21
        assertEquals(excepted, ReverseInteger.reverse(int))
    }

    @Test
    fun test4() {
        val int = 0
        val excepted = 0
        assertEquals(excepted, ReverseInteger.reverse(int))
    }

    @Test
    fun test5() {
        val int = Integer.MAX_VALUE
        val excepted = 0
        assertEquals(excepted, ReverseInteger.reverse(int))
    }
}
