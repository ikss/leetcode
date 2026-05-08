package medium


/**
 * You are given an integer array nums of length n.
 *
 * You start at index 0, and your goal is to reach index n - 1.
 *
 * From any index i, you may perform one of the following operations:
 *
 * * Adjacent Step: Jump to index i + 1 or i - 1, if the index is within bounds.
 * * Prime Teleportation: If `nums[i]` is a prime number p, you may instantly jump to any index j != i such that `nums[j] % p == 0`.
 *
 * Return the minimum number of jumps required to reach index n - 1.
 *
 * [URL](https://leetcode.com/problems/minimum-jumps-to-reach-end-via-prime-teleportation/)
 */
object MinimumJumpsToReachEndViaPrimeTeleportation {
    fun minJumps(nums: IntArray): Int {
        val n = nums.size
        val maxVal = nums.max()

        // SPF sieve
        val sieve = IntArray(maxVal + 1)
        for (i in 2..maxVal) {
            if (sieve[i] == 0) {
                for (j in i..maxVal step i) {
                    if (sieve[j] == 0) {
                        sieve[j] = i
                    }
                }
            }
        }

        fun primeFactors(x: Int): List<Int> {
            var num = x
            val res = ArrayList<Int>()
            while (num > 1) {
                val p = sieve[num]
                res.add(p)
                while (num % p == 0) num /= p
            }
            return res
        }

        fun isPrime(x: Int): Boolean = x >= 2 && sieve[x] == x

        // prime -> indices divisible by prime
        val primeToIndices = HashMap<Int, ArrayList<Int>>()

        for (i in nums.indices) {
            for (p in primeFactors(nums[i])) {
                primeToIndices.getOrPut(p) { ArrayList() }.add(i)
            }
        }

        val queue = java.util.ArrayDeque<Int>()
        val seen = BooleanArray(n)

        queue.addLast(0)
        seen[0] = true

        var steps = 0

        while (queue.isNotEmpty()) {
            val size = queue.size
            for (i in 0 until size) {
                val curr = queue.poll()

                if (curr == n - 1) return steps

                // adjacent
                if (curr > 0 && !seen[curr - 1]) {
                    seen[curr - 1] = true
                    queue.offer(curr - 1)
                }

                if (curr + 1 < n && !seen[curr + 1]) {
                    seen[curr + 1] = true
                    queue.offer(curr + 1)
                }

                // teleport only if nums[i] itself prime
                if (isPrime(nums[curr])) {
                    val p = nums[curr]
                    val list = primeToIndices[p] ?: continue

                    for (j in list) {
                        if (!seen[j]) {
                            seen[j] = true
                            queue.addLast(j)
                        }
                    }

                    list.clear()
                }
            }

            steps++
        }

        return -1
    }
}