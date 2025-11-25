package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignSpreadsheetTest {
    @Test
    fun test1() {
        val speadSheet = DesignSpreadsheet.Spreadsheet(3)
        assertEquals(12, speadSheet.getValue("=5+7"))
        speadSheet.setCell("A1", 10)
        assertEquals(16, speadSheet.getValue("=A1+6"))
        speadSheet.setCell("B2", 15)
        assertEquals(25, speadSheet.getValue("=A1+B2"))
        speadSheet.resetCell("A1")
        assertEquals(15, speadSheet.getValue("=A1+B2"))
    }
}