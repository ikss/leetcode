package arrays.hard

/**
 * You may recall that an array arr is a mountain array if and only if:
 * * arr.length >= 3
 * * There exists some i with 0 < i < arr.length - 1 such that:
 * * * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * * * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 *
 * Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target.
 * If such an index does not exist, return -1.
 *
 * You cannot access the mountain array directly. You may only access the array using a MountainArray interface:
 * * MountainArray.get(k) returns the element of the array at index k (0-indexed).
 * * MountainArray.length() returns the length of the array.
 *
 * Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer.
 * Also, any solutions that attempt to circumvent the judge will result in disqualification.
 *
 * [URL](https://leetcode.com/problems/find-in-mountain-array/)
 */
object FindInMountainArray {
    class MountainArray(val arr: IntArray) {
        private var callCount = 0

        fun get(index: Int): Int {
            if (callCount++ > 100) {
                throw RuntimeException("Too many calls")
            }
            return arr[index]
        }

        fun length(): Int = arr.size
    }

    fun findInMountainArray(target: Int, mountainArr: MountainArray): Int {
        val cache = HashMap<Int, Int>()
        val peak = peakIndex(mountainArr, cache)

        val leftmost = findLeft(peak, target, mountainArr, cache)
        return if (leftmost != -1) {
            leftmost
        } else {
            findRight(peak + 1, target, mountainArr, cache)
        }
    }

    private fun peakIndex(mountainArr: MountainArray, cache: HashMap<Int, Int>): Int {
        var left = 0
        var right = mountainArr.length() - 1

        while (left < right) {
            val mid = left + (right - left) / 2
            val midEl = cache.computeIfAbsent(mid, mountainArr::get)
            val nextEl = cache.computeIfAbsent(mid + 1, mountainArr::get)
            if (midEl < nextEl) {
                left = mid + 1
            } else {
                right = mid
            }
        }

        return left
    }

    private fun findLeft(right: Int, target: Int, mountainArr: MountainArray, cache: HashMap<Int, Int>): Int {
        var left = 0
        var right = right

        while (left != right) {
            val mid = left + (right - left) / 2

            val midEl = cache.computeIfAbsent(mid, mountainArr::get)

            if (midEl == target) {
                return mid
            } else if (midEl < target) {
                left = mid + 1
            } else {
                right = mid
            }
        }

        return if (cache.computeIfAbsent(left, mountainArr::get) == target) {
            left
        } else {
            -1
        }
    }

    private fun findRight(left: Int, target: Int, mountainArr: MountainArray, cache: HashMap<Int, Int>): Int {
        var left = left
        var right = mountainArr.length() - 1

        while (left != right) {
            val mid = left + (right - left) / 2

            val midEl = cache.computeIfAbsent(mid, mountainArr::get)

            if (midEl == target) {
                return mid
            } else if (midEl > target) {
                left = mid + 1
            } else {
                right = mid
            }
        }

        return if (cache.computeIfAbsent(left, mountainArr::get) == target) {
            left
        } else {
            -1
        }
    }
}
