package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ExcelSheetColumnNumberTest {

    @Test
    fun test1() {
        val columnTitle = "A"
        val expected = 1

        assertEquals(expected, ExcelSheetColumnNumber.titleToNumber(columnTitle))
    }

    @Test
    fun test2() {
        val columnTitle = "AB"
        val expected = 28

        assertEquals(expected, ExcelSheetColumnNumber.titleToNumber(columnTitle))
    }

    @Test
    fun test3() {
        val columnTitle = "ZY"
        val expected = 701

        assertEquals(expected, ExcelSheetColumnNumber.titleToNumber(columnTitle))
    }
}
