package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignSQLTest {
    @Test
    fun test1() {
        val sql = DesignSQL.SQL(
            listOf("one", "two", "three"),
            listOf(2, 3, 1),
        )
        assertEquals(true, sql.ins("two", listOf("first", "second", "third")))
        assertEquals("third", sql.sel("two", 1, 3))
        assertEquals(true, sql.ins("two", listOf("fourth", "fifth", "sixth")))
        assertEquals(listOf("1,first,second,third", "2,fourth,fifth,sixth"), sql.exp("two"))
        sql.rmv("two", 1)
        assertEquals("fifth", sql.sel("two", 2, 2))
        assertEquals(listOf("2,fourth,fifth,sixth"), sql.exp("two"))

    }
}