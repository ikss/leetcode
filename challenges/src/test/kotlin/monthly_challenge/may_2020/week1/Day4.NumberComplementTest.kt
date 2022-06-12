package monthly_challenge.may_2020.week1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberComplementTest {

    @Test
    fun test1() {
        assertEquals(2, NumberComplement.findComplement(5))
    }

    @Test
    fun test2() {
        assertEquals(0, NumberComplement.findComplement(1))
    }
}
