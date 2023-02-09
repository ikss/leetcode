package strings.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NamingCompanyTest {

    @Test
    fun test1() {
        val ideas = arrayOf("coffee", "donuts", "time", "toffee")
        val expected = 6L

        assertEquals(expected, NamingCompany.distinctNames(ideas))
    }

    @Test
    fun test2() {
        val ideas = arrayOf("lack", "back")
        val expected = 0L

        assertEquals(expected, NamingCompany.distinctNames(ideas))
    }
}