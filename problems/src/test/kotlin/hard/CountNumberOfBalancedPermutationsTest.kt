package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountNumberOfBalancedPermutationsTest {
    @Test
    fun test1() {
        val num = "123"
        val expected = 2

        assertEquals(expected, CountNumberOfBalancedPermutations.countBalancedPermutations(num))
    }

    @Test
    fun test2() {
        val num = "112"
        val expected = 1

        assertEquals(expected, CountNumberOfBalancedPermutations.countBalancedPermutations(num))
    }
}