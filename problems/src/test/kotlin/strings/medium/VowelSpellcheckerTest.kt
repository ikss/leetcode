package strings.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class VowelSpellcheckerTest {
    @Test
    fun test1() {
        val wordlist = arrayOf("KiTe", "kite", "hare", "Hare")
        val queries = arrayOf("kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto")
        val expected = arrayOf("kite", "KiTe", "KiTe", "Hare", "hare", "", "", "KiTe", "", "KiTe")

        assertArrayEquals(expected, VowelSpellchecker.spellchecker(wordlist, queries))
    }

    @Test
    fun test2() {
        val wordlist = arrayOf("yellow")
        val queries = arrayOf("YellOw")
        val expected = arrayOf("yellow")

        assertArrayEquals(expected, VowelSpellchecker.spellchecker(wordlist, queries))
    }


}