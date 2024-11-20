package design.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SerializeAndDeserializeBSTTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(2, 1, 3)
        val codec = SerializeAndDeserializeBST.Codec()
        val serialized = codec.serialize(root)

        assertEquals("2,1,3,null,null,null,null", serialized)
        assertEquals(root, codec.deserialize(serialized))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build()
        val codec = SerializeAndDeserializeBST.Codec()
        val serialized = codec.serialize(root)

        assertEquals("null", serialized)
        assertEquals(root, codec.deserialize(serialized))
    }
}