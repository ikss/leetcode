package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfPeopleAwareOfSecretTest {
    @Test
    fun test1() {
        val n = 6
        val delay = 2
        val forget = 4
        val expected = 5

        assertEquals(expected, NumberOfPeopleAwareOfSecret.peopleAwareOfSecret(n, delay, forget))
    }

    @Test
    fun test2() {
        val n = 4
        val delay = 1
        val forget = 3
        val expected = 6

        assertEquals(expected, NumberOfPeopleAwareOfSecret.peopleAwareOfSecret(n, delay, forget))
    }

    @Test
    fun test3() {
        val n = 684
        val delay = 18
        val forget = 496
        val expected = 653668527

        assertEquals(expected, NumberOfPeopleAwareOfSecret.peopleAwareOfSecret(n, delay, forget))
    }
}