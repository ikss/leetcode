package math.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ExcelSheetColumnTitleTest {

    @Test
    fun test1() {
        val columnNumber = 1
        val expected = "A"

        assertEquals(expected, ExcelSheetColumnTitle.convertToTitle(columnNumber))
    }

    @Test
    fun test2() {
        val columnNumber = 28
        val expected = "AB"

        assertEquals(expected, ExcelSheetColumnTitle.convertToTitle(columnNumber))
    }

    @Test
    fun test3() {
        val columnNumber = 701
        val expected = "ZY"

        assertEquals(expected, ExcelSheetColumnTitle.convertToTitle(columnNumber))
    }
}