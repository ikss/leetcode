package trees.hard

import data_structures.NaryTreeBuilder
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SerializeAndDeserializeNaryTreeTest {
    @Test
    fun test1() {
        val root = NaryTreeBuilder.build(1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13, null, null, 14)
        val serialized = SerializeAndDeserializeNaryTree.serialize(root)
        assertEquals("1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14,null,null,null,null", serialized)
        
        val deserialized = SerializeAndDeserializeNaryTree.deserialize(serialized)
        assertEquals(root, deserialized)
    }
    
    @Test
    fun test2() {
        val root = NaryTreeBuilder.build(1, null, 3, 2, 4, null, 5, 6)
        val serialized = SerializeAndDeserializeNaryTree.serialize(root)
        assertEquals("1,null,3,2,4,null,5,6,null,null,null,null,null", serialized)
        
        val deserialized = SerializeAndDeserializeNaryTree.deserialize(serialized)
        assertEquals(root, deserialized)
    }
    
    @Test
    fun test3() {
        val root = NaryTreeBuilder.build()
        val serialized = SerializeAndDeserializeNaryTree.serialize(root)
        assertEquals("", serialized)
        
        val deserialized = SerializeAndDeserializeNaryTree.deserialize(serialized)
        assertEquals(root, deserialized)
    }
}