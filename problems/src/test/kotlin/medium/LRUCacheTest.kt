package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LRUCacheTest {
    @Test
    fun test1() {
        val lRUCache = LRUCache.LRUCache(2)
        lRUCache[1] = 1 // cache is {1=1}
        lRUCache[2] = 2 // cache is {1=1, 2=2}
        assertEquals(1, lRUCache[1]) // return 1

        lRUCache[3] = 3 // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        assertEquals(lRUCache[2], -1) // returns -1 (not found)

        lRUCache[4] = 4 // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        assertEquals(lRUCache[1], -1) // return -1 (not found)
        assertEquals(lRUCache[3], 3) // return 3
        assertEquals(lRUCache[4], 4) // return 4
    }
}