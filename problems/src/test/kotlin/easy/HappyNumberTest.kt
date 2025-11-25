package easy

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class HappyNumberTest {

    @Test
    fun test1() {
        val n = 19

        assertTrue(HappyNumber.isHappy(n))
    }

    @Test
    fun test2() {
        val n = 2

        assertFalse(HappyNumber.isHappy(n))
    }

    @Test
    fun test3() {
        val n = 0

        assertFalse(HappyNumber.isHappy(n))
    }
}
