package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountVowelsPermutationTest {

    @Test
    fun test1() {
        val n = 1
        val expected = 5

        assertEquals(expected, CountVowelsPermutation.countVowelPermutation(n))
    }

    @Test
    fun test2() {
        val n = 2
        val expected = 10

        assertEquals(expected, CountVowelsPermutation.countVowelPermutation(n))
    }

    @Test
    fun test3() {
        val n = 5
        val expected = 68

        assertEquals(expected, CountVowelsPermutation.countVowelPermutation(n))
    }
}
