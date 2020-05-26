package week1

import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.reset
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FirstBadVersionTest {
    private val versionControl = mock<VersionControl>()

    @BeforeEach
    fun init() {
        reset(versionControl)
    }

    @Test
    fun test1() {
        whenever(versionControl.isBadVersion(any())).thenAnswer {
            it.arguments[0] as Int >= 4
        }
        assertEquals(4, FirstBadVersion(versionControl).firstBadVersion(5))
        verify(versionControl, times(2)).isBadVersion(any())
    }

    @Test
    fun test2() {
        whenever(versionControl.isBadVersion(any())).thenAnswer {
            it.arguments[0] as Int >= 1
        }
        assertEquals(1, FirstBadVersion(versionControl).firstBadVersion(1000))
        verify(versionControl, times(10)).isBadVersion(any())
    }
}
