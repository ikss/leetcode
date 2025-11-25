package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindInMountainArrayTest {
    @Test
    fun test1() {
        val array = FindInMountainArray.MountainArray(intArrayOf(1, 2, 3, 4, 5, 3, 1))
        val target = 3
        val expected = 2

        assertEquals(expected, FindInMountainArray.findInMountainArray(target, array))
    }

    @Test
    fun test2() {
        val array = FindInMountainArray.MountainArray(intArrayOf(0, 1, 2, 4, 2, 1))
        val target = 3
        val expected = -1

        assertEquals(expected, FindInMountainArray.findInMountainArray(target, array))
    }
}