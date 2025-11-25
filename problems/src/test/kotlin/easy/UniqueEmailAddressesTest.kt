package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UniqueEmailAddressesTest {
    @Test
    fun test1() {
        val emails = arrayOf(
            "test.email+alex@leetcode.com",
            "test.e.mail+bob.cathy@leetcode.com",
            "testemail+david@lee.tcode.com",
        )
        val expected = 2

        assertEquals(expected, UniqueEmailAddresses.numUniqueEmails(emails))
    }

    @Test
    fun test2() {
        val emails = arrayOf("a@leetcode.com", "b@leetcode.com", "c@leetcode.com")
        val expected = 3

        assertEquals(expected, UniqueEmailAddresses.numUniqueEmails(emails))
    }
}