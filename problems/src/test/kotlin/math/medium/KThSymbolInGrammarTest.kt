package math.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KThSymbolInGrammarTest {
    @Test
    fun test1() {
        val n = 1
        val k = 1
        val expected = 0
        assertEquals(expected, KThSymbolInGrammar.kthGrammar(n, k))
    }

    @Test
    fun test2() {
        val n = 2
        val k = 1
        val expected = 0
        assertEquals(expected, KThSymbolInGrammar.kthGrammar(n, k))
    }

    @Test
    fun test3() {
        val n = 2
        val k = 2
        val expected = 1
        assertEquals(expected, KThSymbolInGrammar.kthGrammar(n, k))
    }

    @Test
    fun test1own() {
        val n = 1
        val k = 1
        val expected = 0
        assertEquals(expected, KThSymbolInGrammar.kthGrammarOwn(n, k))
    }

    @Test
    fun test2own() {
        val n = 2
        val k = 1
        val expected = 0
        assertEquals(expected, KThSymbolInGrammar.kthGrammarOwn(n, k))
    }

    @Test
    fun test3own() {
        val n = 2
        val k = 2
        val expected = 1
        assertEquals(expected, KThSymbolInGrammar.kthGrammarOwn(n, k))
    }

}