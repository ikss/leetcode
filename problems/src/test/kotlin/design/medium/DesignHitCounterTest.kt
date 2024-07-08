package design.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignHitCounterTest {
    @Test
    fun test1() {
        val hitCounter = DesignHitCounter.HitCounter()
        hitCounter.hit(1)
        hitCounter.hit(2)
        hitCounter.hit(3)
        assertEquals(3, hitCounter.getHits(4))
        
        hitCounter.hit(300)
        assertEquals(4, hitCounter.getHits(300))
        assertEquals(3, hitCounter.getHits(301))
    }
}