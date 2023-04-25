package design.medium

import design.medium.SmallestNumberInInfiniteSet.SmallestInfiniteSet
import org.junit.jupiter.api.Test


class SmallestNumberInInfiniteSetTest {

    @Test
    fun test1() {
        val smallestInfiniteSet = SmallestInfiniteSet()
        // 2 is already in the set, so no change is made.
        smallestInfiniteSet.addBack(2)

        // return 1, since 1 is the smallest number, and remove it from the set.
        smallestInfiniteSet.popSmallest()

        // return 2, and remove it from the set.
        smallestInfiniteSet.popSmallest()

        // return 3, and remove it from the set.
        smallestInfiniteSet.popSmallest()

        // 1 is added back to the set.
        smallestInfiniteSet.addBack(1)

        // return 1, since 1 was added back to the set and is the smallest number, and remove it from the set.
        smallestInfiniteSet.popSmallest()

        // return 4, and remove it from the set.
        smallestInfiniteSet.popSmallest()

        // return 5, and remove it from the set.
        smallestInfiniteSet.popSmallest()
    }
}