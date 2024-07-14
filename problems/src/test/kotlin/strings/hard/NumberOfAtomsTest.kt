package strings.hard

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NumberOfAtomsTest {
    @Test
    fun test1() {
        val formula = "H2O"
        val expected = "H2O"
        
        assertEquals(expected, NumberOfAtoms.countOfAtoms(formula))
    }
    
    @Test
    fun test2() {
        val formula = "Mg(OH)2"
        val expected = "H2MgO2"
        
        assertEquals(expected, NumberOfAtoms.countOfAtoms(formula))
    }
    
    @Test
    fun test3() {
        val formula = "K4(ON(SO3)2)2"
        val expected = "K4N2O14S4"
        
        assertEquals(expected, NumberOfAtoms.countOfAtoms(formula))
    }
}