package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RestoreTheArrayTest {

    @Test
    fun test1() {
        val s = "1000"
        val k = 10000
        val expected = 1

        assertEquals(expected, RestoreTheArray.numberOfArrays(s, k))
    }

    @Test
    fun test2() {
        val s = "1000"
        val k = 10
        val expected = 0

        assertEquals(expected, RestoreTheArray.numberOfArrays(s, k))
    }

    @Test
    fun test3() {
        val s = "1317"
        val k = 2000
        val expected = 8

        assertEquals(expected, RestoreTheArray.numberOfArrays(s, k))
    }
}