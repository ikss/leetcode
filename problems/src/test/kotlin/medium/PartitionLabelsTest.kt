package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PartitionLabelsTest {
    @Test
    fun test1() {
        val s = "ababcbacadefegdehijhklij"
        val expected = listOf(9, 7, 8)

        assertEquals(expected, PartitionLabels.partitionLabels(s))
    }
    
    @Test
    fun test2() {
        val s = "eccbbbbdec"
        val expected = listOf(10)

        assertEquals(expected, PartitionLabels.partitionLabels(s))
    }
}