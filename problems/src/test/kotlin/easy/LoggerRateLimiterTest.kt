package easy

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class LoggerRateLimiterTest {
    @Test
    fun test1LoggerMap() {
        val loggerRateLimiter = LoggerRateLimiter.LoggerMap()
        assertTrue(loggerRateLimiter.shouldPrintMessage(1, "foo"))
        assertTrue(loggerRateLimiter.shouldPrintMessage(2, "bar"))

        assertFalse(loggerRateLimiter.shouldPrintMessage(3, "foo"))
        assertFalse(loggerRateLimiter.shouldPrintMessage(8, "bar"))
        assertFalse(loggerRateLimiter.shouldPrintMessage(10, "foo"))

        assertTrue(loggerRateLimiter.shouldPrintMessage(11, "foo"))
    }

    @Test
    fun test1LoggerQueue() {
        val loggerRateLimiter = LoggerRateLimiter.LoggerQueue()
        assertTrue(loggerRateLimiter.shouldPrintMessage(1, "foo"))
        assertTrue(loggerRateLimiter.shouldPrintMessage(2, "bar"))

        assertFalse(loggerRateLimiter.shouldPrintMessage(3, "foo"))
        assertFalse(loggerRateLimiter.shouldPrintMessage(8, "bar"))
        assertFalse(loggerRateLimiter.shouldPrintMessage(10, "foo"))

        assertTrue(loggerRateLimiter.shouldPrintMessage(11, "foo"))
    }
}