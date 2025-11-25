package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheKthLargestIntegerInTheArrayTest {
    @Test
    fun test1() {
        val nums = arrayOf("3", "6", "7", "10")
        val k = 4
        val expected = "3"

        assertEquals(expected, FindTheKthLargestIntegerInTheArray.kthLargestNumber(nums, k))
    }
    
    @Test
    fun test2() {
        val nums = arrayOf("2", "21", "12", "1")
        val k = 3
        val expected = "2"

        assertEquals(expected, FindTheKthLargestIntegerInTheArray.kthLargestNumber(nums, k))
    }
    
    @Test
    fun test3() {
        val nums = arrayOf("623986800", "3", "887298", "695", "794", "6888794705", "269409", "59930972", "723091307", "726368", "8028385786", "378585")
        val k = 11
        val expected = "695"

        assertEquals(expected, FindTheKthLargestIntegerInTheArray.kthLargestNumber(nums, k))
    }
}