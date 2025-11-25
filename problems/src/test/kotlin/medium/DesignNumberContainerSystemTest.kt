package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignNumberContainerSystemTest {
    @Test
    fun test1() {
        val numberContainer = DesignNumberContainerSystem.NumberContainers()
        assertEquals(-1, numberContainer.find(10))

        numberContainer.change(2, 10)
        numberContainer.change(1, 10)
        numberContainer.change(3, 10)
        numberContainer.change(5, 10)
        assertEquals(1, numberContainer.find(10))

        numberContainer.change(1, 20)
        assertEquals(2, numberContainer.find(10))
    }

}