package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SnapshotArrayTest {

    @Test
    fun test1() {
        // set the length to be 3
        val snapshotArr = SnapshotArray.SnapshotArray(3)

        // Set array[0] = 5
        snapshotArr.set(0, 5)

        // Take a snapshot, return snap_id = 0
        snapshotArr.snap()

        snapshotArr.set(0, 6)
        // Get the value of array[0] with snap_id = 0, return 5
        assertEquals(5, snapshotArr.get(0, 0))

        // Get the value of array[0] with snap_id = 1, return 6
        assertEquals(6, snapshotArr.get(0, 1))
    }
}