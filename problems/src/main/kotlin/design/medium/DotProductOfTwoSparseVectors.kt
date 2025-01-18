package design.medium

/**
 * Given two sparse vectors, compute their dot product.
 *
 * Implement class SparseVector:
 * * SparseVector(nums) Initializes the object with the vector nums
 * * dotProduct(vec) Compute the dot product between the instance of SparseVector and vec
 *
 * A sparse vector is a vector that has mostly zero values, you should store the sparse vector efficiently and compute
 * the dot product between two SparseVector.
 *
 * Follow up: What if only one of the vectors is sparse?
 *
 * [URL](https://leetcode.com/problems/dot-product-of-two-sparse-vectors/)
 */
object DotProductOfTwoSparseVectors {
    class SparseVector(nums: IntArray) {
        val size = nums.size

        private sealed interface Node {
            val value: Int
            val index: Int
        }

        private data class ZeroNode(override val index: Int, val count: Int) : Node {
            override val value = 0
        }

        private data class NumNode(override val index: Int, override val value: Int) : Node

        private val stored = ArrayList<Node>()

        init {
            var count = 0
            for (i in nums.indices) {
                val n = nums[i]
                if (n == 0) {
                    count++
                    continue
                }
                if (count != 0) {
                    stored.add(ZeroNode(i - count, count))
                    count = 0
                }
                stored.add(NumNode(i, n))
            }
            if (count != 0) {
                stored.add(ZeroNode(nums.size - count, count))
            }
        }

        // Return the dotProduct of two sparse vectors
        fun dotProduct(vec: SparseVector): Int {
            var i1 = 0
            var i2 = 0

            var product = 0
            for (i in 0 until size) {
                val curr = this.stored[i1]
                val next = vec.stored[i2]
                product += curr.value * next.value

                if (curr !is ZeroNode || curr.index + curr.count == i + 1) {
                    i1++
                }
                if (next !is ZeroNode || next.index + next.count == i + 1) {
                    i2++
                }
            }

            return product
        }
    }

    /**
     * Your SparseVector object will be instantiated and called as such:
     * var v1 = SparseVector(nums1)
     * var v2 = SparseVector(nums2)
     * val ans = v1.dotProduct(v2)
     */
}