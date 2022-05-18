package week1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class JewelsAndStonesTest {

    @Test
    fun test1() {
        assertEquals(3, JewelsAndStones.numJewelsInStones("aA", "aAAbbbb"))
    }

    @Test
    fun test2() {
        assertEquals(0, JewelsAndStones.numJewelsInStones("z", "ZZ"))
    }
}
