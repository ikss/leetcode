package graphs.medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CountPairsOfConnectableServersInWeightedTreeNetworkTest {
    @Test
    fun test1() {
        val connections = arrayOf(
            intArrayOf(0, 1, 1),
            intArrayOf(1, 2, 5),
            intArrayOf(2, 3, 13),
            intArrayOf(3, 4, 9),
            intArrayOf(4, 5, 2)
        )
        val signalSpeed = 1
        val expected = intArrayOf(0, 4, 6, 6, 4, 0)
        val actual = CountPairsOfConnectableServersInWeightedTreeNetwork.countPairsOfConnectableServers(connections, signalSpeed)
        
        assertArrayEquals(expected, actual)
    }
    
    @Test
    fun test2() {
        val connections = arrayOf(
            intArrayOf(0, 6, 3),
            intArrayOf(6, 5, 3),
            intArrayOf(0, 3, 1),
            intArrayOf(3, 2, 7),
            intArrayOf(3, 1, 6),
            intArrayOf(3, 4, 2),
        )
        val signalSpeed = 3
        val expected = intArrayOf(2, 0, 0, 0, 0, 0, 2)
        val actual = CountPairsOfConnectableServersInWeightedTreeNetwork.countPairsOfConnectableServers(connections, signalSpeed)
        
        assertArrayEquals(expected, actual)
    }
}