package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FillingBookcaseShelvesTest {
    @Test
    fun test1() {
        val books = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(2, 3),
            intArrayOf(2, 3),
            intArrayOf(1, 1),
            intArrayOf(1, 1),
            intArrayOf(1, 1),
            intArrayOf(1, 2),
        )
        val shelfWidth = 4
        val result = 6
        
        assertEquals(result, FillingBookcaseShelves.minHeightShelves(books, shelfWidth))
    }
    
    @Test
    fun test2() {
        val books = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(2, 4),
            intArrayOf(3, 2),
        )
        val shelfWidth = 6
        val result = 4
        
        assertEquals(result, FillingBookcaseShelves.minHeightShelves(books, shelfWidth))
    }
}