package design.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TwoSumIIIDataStructureDesignTest {
    @Test
    fun test1() {
        val twoSum = TwoSumIIIDataStructureDesign.TwoSum()
        twoSum.add(1)
        twoSum.add(3)
        twoSum.add(5)
        assertEquals(true, twoSum.find(4)) // 1 + 3 = 4
        assertEquals(false, twoSum.find(7))  // 3 + 5 = 8

        twoSum.add(1)
        assertEquals(true, twoSum.find(2))  // 1 + 1 = 2
    }
}