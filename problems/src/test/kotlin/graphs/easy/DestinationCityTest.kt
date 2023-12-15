package graphs.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DestinationCityTest {
    @Test
    fun test1() {
        val paths = listOf(
            listOf("London", "New York"),
            listOf("New York", "Lima"),
            listOf("Lima", "Sao Paulo"),
        )
        val expected = "Sao Paulo"

        assertEquals(expected, DestinationCity.destCity(paths))
    }

    @Test
    fun test2() {
        val paths = listOf(
            listOf("B", "C"),
            listOf("D", "B"),
            listOf("C", "A"),
        )
        val expected = "A"

        assertEquals(expected, DestinationCity.destCity(paths))
    }

    @Test
    fun test3() {
        val paths = listOf(
            listOf("A", "Z"),
        )
        val expected = "Z"

        assertEquals(expected, DestinationCity.destCity(paths))
    }
}