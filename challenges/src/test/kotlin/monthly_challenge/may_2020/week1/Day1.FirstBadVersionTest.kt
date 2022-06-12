package monthly_challenge.may_2020.week1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FirstBadVersionTest {

    @Test
    fun test1() {
        val checker = object : FirstBadVersion() {
            override fun isBadVersion(version: Int): Boolean = version >= 4
        }
        assertEquals(4, checker.firstBadVersion(5))
    }

    @Test
    fun test2() {
        val checker = object : FirstBadVersion() {
            override fun isBadVersion(version: Int): Boolean = version >= 1
        }
        assertEquals(1, checker.firstBadVersion(1000))
    }
}
