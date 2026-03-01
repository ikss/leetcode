package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignExcelSumFormulaTest {
    @Test
    fun test1() {
        val excel = DesignExcelSumFormula.Excel(3, 'C')
        excel.set(1, 'A', 2)
        assertEquals(4, excel.sum(3, 'C', arrayOf("A1", "A1:B2")))
        excel.set(2, 'B', 2)
        assertEquals(6, excel.get(3, 'C'))
    }

    @Test
    fun test2() {
        val excel = DesignExcelSumFormula.Excel(5, 'E')
        assertEquals(0, excel.get(1, 'A'))
        excel.set(1, 'A', 1)
        assertEquals(1, excel.get(1, 'A'))
        assertEquals(2, excel.sum(2, 'B', arrayOf("A1", "A1")))
        excel.set(1, 'A', 2)
        assertEquals(4, excel.get(2, 'B'))
    }
}