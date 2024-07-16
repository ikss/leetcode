package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StepByStepDirectionsFromBinaryTreeNodeToAnotherTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(5, 1, 2, 3, null, 6, 4)
        val startValue = 3
        val destValue = 6
        val expected = "UURL"
        
        assertEquals(expected, StepByStepDirectionsFromBinaryTreeNodeToAnother.getDirections(root, startValue, destValue))
    }
    
    @Test
    fun test2() {
        val root = TreeBuilder.build(2,1)
        val startValue = 2
        val destValue = 1
        val expected = "L"
        
        assertEquals(expected, StepByStepDirectionsFromBinaryTreeNodeToAnother.getDirections(root, startValue, destValue))
    }
}