package easy

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DesignParkingSystemTest {

    @Test
    fun test1() {
        val parkingSystem = DesignParkingSystem.ParkingSystem(1, 1, 0)
        assertTrue(parkingSystem.addCar(1)) // return true because there is 1 available slot for a big car
        assertTrue(parkingSystem.addCar(2)) // return true because there is 1 available slot for a medium car
        assertFalse(parkingSystem.addCar(3)) // return false because there is no available slot for a small car
        assertFalse(parkingSystem.addCar(1)) // return false because there is no available slot for a big car. It is already occupied.
    }
}