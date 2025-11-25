package hard

/**
 * Design a data structure to store the strings' count with the ability to return the strings with minimum
 * and maximum counts.
 *
 * Implement the AllOne class:
 * * AllOne() Initializes the object of the data structure.
 * * inc(String key) Increments the count of the string key by 1. If key does not exist in the data structure,
 * insert it with count 1.
 * * dec(String key) Decrements the count of the string key by 1. If the count of key is 0 after the decrement,
 * remove it from the data structure. It is guaranteed that key exists in the data structure before the decrement.
 * * getMaxKey() Returns one of the keys with the maximal count. If no element exists, return an empty string "".
 * * getMinKey() Returns one of the keys with the minimum count. If no element exists, return an empty string "".
 *
 * Note that each function must run in O(1) average time complexity.
 *
 * [URL](https://leetcode.com/problems/all-oone-data-structure/description/)
 */
object `AllO(1)DataStructure` {
    class AllOne {
        class Node(var freq: Int) {
            var prev: Node? = null
            var next: Node? = null
            var keys: HashSet<String> = HashSet()
        }

        private var head: Node = Node(0)
        private var tail: Node = Node(0)
        private var map = HashMap<String, Node>()

        init {
            head.next = tail
            tail.prev = head
        }

        fun inc(key: String) {
            val node = map[key]

            if (node != null) {
                val freq = node.freq
                node.keys.remove(key)

                val nextNode: Node = node.next!!
                if (nextNode === tail || nextNode.freq != freq + 1) {
                    val newNode = Node(freq + 1)
                    newNode.keys.add(key)
                    newNode.prev = node
                    newNode.next = nextNode
                    node.next = newNode
                    nextNode.prev = newNode
                    map[key] = newNode
                } else {
                    nextNode.keys.add(key)
                    map[key] = nextNode
                }

                if (node.keys.isEmpty()) {
                    removeNode(node)
                }
                return
            }

            val firstNode: Node = head.next!!
            if (firstNode === tail || firstNode.freq > 1) {
                val newNode = Node(1).apply {
                    keys.add(key)
                    prev = head
                    next = firstNode
                }
                head.next = newNode
                firstNode.prev = newNode
                map[key] = newNode
            } else {
                firstNode.keys.add(key)
                map[key] = firstNode
            }
        }

        fun dec(key: String) {
            val node = map[key] ?: return

            node.keys.remove(key)
            val freq: Int = node.freq

            if (freq == 1) {
                map.remove(key)
            } else {
                val prevNode: Node = node.prev!!
                if (prevNode === head || prevNode.freq != freq - 1) {
                    val newNode = Node(freq - 1).apply {
                        keys.add(key)
                        prev = prevNode
                        next = node
                    }

                    prevNode.next = newNode
                    node.prev = newNode
                    map[key] = newNode
                } else {
                    prevNode.keys.add(key)
                    map[key] = prevNode
                }
            }
            if (node.keys.isEmpty()) {
                removeNode(node)
            }
        }

        fun getMinKey(): String {
            if (head.next === tail) {
                return ""
            }
            return head.next!!.keys.first()
        }

        fun getMaxKey(): String {
            if (head.next === tail) {
                return ""
            }
            return tail.prev!!.keys.first()
        }

        private fun removeNode(node: Node) {
            val prevNode = node.prev!!
            val nextNode = node.next!!

            prevNode.next = nextNode
            nextNode.prev = prevNode
        }
    }
}