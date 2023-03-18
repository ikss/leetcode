package design.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignBrowserHistoryTest {
    @Test
    fun test1() {
        val browserHistory = DesignBrowserHistory.BrowserHistory("leetcode.com")
        // You are in "leetcode.com". Visit "google.com"
        browserHistory.visit("google.com")
        // You are in "google.com". Visit "facebook.com"
        browserHistory.visit("facebook.com")
        // You are in "facebook.com". Visit "youtube.com"
        browserHistory.visit("youtube.com")
        // You are in "youtube.com", move back to "facebook.com" return "facebook.com"
        assertEquals("facebook.com", browserHistory.back(1))
        // You are in "facebook.com", move back to "google.com" return "google.com"
        assertEquals("google.com", browserHistory.back(1))
        // You are in "google.com", move forward to "facebook.com" return "facebook.com"
        assertEquals("facebook.com", browserHistory.forward(1))
        // You are in "facebook.com". Visit "linkedin.com"
        browserHistory.visit("linkedin.com")
        // You are in "linkedin.com", you cannot move forward any steps.
        assertEquals("linkedin.com", browserHistory.forward(2))
        // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
        assertEquals("google.com", browserHistory.back(2))
        // You are in "google.com", you can move back only one step to "leetcode.com". return "leetcode.com"
        assertEquals("leetcode.com", browserHistory.back(7))
    }
}