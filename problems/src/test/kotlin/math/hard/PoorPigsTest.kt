package math.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PoorPigsTest {

    @Test
    fun test1() {
        val buckets = 1000
        val minutesToDie = 15
        val minutesToTest = 60
        val expected = 5

        assertEquals(expected, PoorPigs.poorPigs(buckets, minutesToDie, minutesToTest))
    }

    @Test
    fun test2() {
        val buckets = 4
        val minutesToDie = 15
        val minutesToTest = 15
        val expected = 2

        assertEquals(expected, PoorPigs.poorPigs(buckets, minutesToDie, minutesToTest))
    }

    @Test
    fun test3() {
        val buckets = 4
        val minutesToDie = 15
        val minutesToTest = 30
        val expected = 2

        assertEquals(expected, PoorPigs.poorPigs(buckets, minutesToDie, minutesToTest))
    }
}
