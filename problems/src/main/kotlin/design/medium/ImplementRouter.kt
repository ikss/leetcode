package design.medium

/**
 * Design a data structure that can efficiently manage data packets in a network router.
 * Each data packet consists of the following attributes:
 * * source: A unique identifier for the machine that generated the packet.
 * * destination: A unique identifier for the target machine.
 * * timestamp: The time at which the packet arrived at the router.
 *
 * Implement the Router class:
 *
 * Router(int memoryLimit): Initializes the Router object with a fixed memory limit.
 * * memoryLimit is the maximum number of packets the router can store at any given time.
 * * If adding a new packet would exceed this limit, the oldest packet must be removed to free up space.
 *
 * bool addPacket(int source, int destination, int timestamp): Adds a packet with the given attributes to the router.
 * * A packet is considered a duplicate if another packet with the same source, destination,
 * and timestamp already exists in the router.
 * * Return true if the packet is successfully added (i.e., it is not a duplicate); otherwise return false.
 *
 * int[] forwardPacket(): Forwards the next packet in FIFO (First In First Out) order.
 * * Remove the packet from storage.
 * * Return the packet as an array [source, destination, timestamp].
 * * If there are no packets to forward, return an empty array.
 *
 * int getCount(int destination, int startTime, int endTime):
 * * Returns the number of packets currently stored in the router (i.e., not yet forwarded) that have the specified
 * destination and have timestamps in the inclusive range `[startTime, endTime]`.
 *
 * Note that queries for addPacket will be made in increasing order of timestamp.
 *
 * [URL](https://leetcode.com/problems/implement-router/)
 */
object ImplementRouter {
    class Router(val memoryLimit: Int) {
        @JvmRecord
        private data class Packet(
            val source: Int,
            val destination: Int,
            val timestamp: Int,
        )

        private val packetQueue = java.util.ArrayDeque<Packet>()
        private val packetSet = HashSet<Packet>()
        private val destinationsCount = HashMap<Int, ArrayList<Int>>()

        fun addPacket(source: Int, destination: Int, timestamp: Int): Boolean {
            val packet = Packet(source, destination, timestamp)
            if (packet in packetSet) {
                return false
            }
            if (packetQueue.size == memoryLimit) {
                forwardPacket()
            }
            packetSet.add(packet)
            packetQueue.offer(packet)
            destinationsCount.computeIfAbsent(destination) { ArrayList() }.add(timestamp)

            return true
        }

        fun forwardPacket(): IntArray {
            if (packetQueue.isEmpty()) {
                return intArrayOf()
            }
            val packet = packetQueue.poll()
            packetSet.remove(packet)
            destinationsCount[packet.destination]!!.removeAt(0)

            return intArrayOf(packet.source, packet.destination, packet.timestamp)
        }

        fun getCount(destination: Int, startTime: Int, endTime: Int): Int {
            val list = destinationsCount.get(destination)
            if (list == null || list.isEmpty()) return 0

            val left = lowerBound(list, startTime)
            val right = upperBound(list, endTime)

            return right - left
        }

        private fun lowerBound(list: List<Int>, target: Int): Int {
            var low = 0
            var high = list.size

            while (low < high) {
                val mid = (high - low) / 2 + low
                if (list[mid] < target) {
                    low = mid + 1
                } else {
                    high = mid
                }
            }

            return low
        }

        private fun upperBound(list: List<Int>, target: Int): Int {
            var low = 0
            var high = list.size

            while (low < high) {
                val mid = (high - low) / 2 + low

                if (list[mid] <= target) {
                    low = mid + 1
                } else {
                    high = mid
                }
            }

            return low
        }
    }
}