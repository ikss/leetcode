package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignPhoneDirectoryTest {
    @Test
    fun test1() {
        val phoneDirectory = DesignPhoneDirectory.PhoneDirectory(3)
        assertEquals(0, phoneDirectory.get())
        assertEquals(1, phoneDirectory.get())
        assertEquals(true, phoneDirectory.check(2))
        assertEquals(2, phoneDirectory.get())
        assertEquals(false, phoneDirectory.check(2))
        phoneDirectory.release(2)
        assertEquals(true, phoneDirectory.check(2))
    }
}