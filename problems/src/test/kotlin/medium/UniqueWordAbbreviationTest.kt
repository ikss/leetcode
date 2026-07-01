package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UniqueWordAbbreviationTest {
    @Test
    fun test1() {
        val dict = arrayOf("deer", "door", "cake", "card")
        val validWordAbbr = UniqueWordAbbreviation.ValidWordAbbr(dict)
        assertEquals(false, validWordAbbr.isUnique("dear"))
        assertEquals(true, validWordAbbr.isUnique("cart"))
        assertEquals(false, validWordAbbr.isUnique("cane"))
        assertEquals(true, validWordAbbr.isUnique("make"))
        assertEquals(true, validWordAbbr.isUnique("cake"))
    }
}