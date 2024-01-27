package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KInversePairsArrayTest {

    @Test
    fun test1recursive() {
        val n = 3
        val k = 0
        val expected = 1

        assertEquals(expected, KInversePairsArrays.kInversePairsRecursive(n, k))
    }

    @Test
    fun test2recursive() {
        val n = 3
        val k = 1
        val expected = 2

        assertEquals(expected, KInversePairsArrays.kInversePairsRecursive(n, k))
    }

    @Test
    fun test1dp() {
        val n = 3
        val k = 0
        val expected = 1

        assertEquals(expected, KInversePairsArrays.kInversePairsDp(n, k))
    }

    @Test
    fun test2dp() {
        val n = 3
        val k = 1
        val expected = 2

        assertEquals(expected, KInversePairsArrays.kInversePairsDp(n, k))
    }
}
