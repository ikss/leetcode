package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ProductOfTheLastKNumbersTest {
    @Test
    fun test1() {
        val productOfTheLastKNumbers = ProductOfTheLastKNumbers.ProductOfNumbers()
        productOfTheLastKNumbers.add(3)
        productOfTheLastKNumbers.add(0)
        productOfTheLastKNumbers.add(2)
        productOfTheLastKNumbers.add(5)
        productOfTheLastKNumbers.add(4)
        assertEquals(20, productOfTheLastKNumbers.getProduct(2))
        assertEquals(40, productOfTheLastKNumbers.getProduct(3))
        assertEquals(0, productOfTheLastKNumbers.getProduct(4))
        productOfTheLastKNumbers.add(8)
        assertEquals(32, productOfTheLastKNumbers.getProduct(2))
    }
}