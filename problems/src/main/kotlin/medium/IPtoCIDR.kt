package medium

/**
 * An IP address is a formatted 32-bit unsigned integer where each group of 8 bits is printed as a decimal
 * number and the dot character '.' splits the groups.
 * * For example, the binary number 00001111 10001000 11111111 01101011 (spaces added for clarity)
 * formatted as an IP address would be "15.136.255.107".
 *
 * A CIDR block is a format used to denote a specific set of IP addresses. It is a string consisting of a base
 * IP address, followed by a slash, followed by a prefix length k. The addresses it covers are all the
 * IPs whose first k bits are the same as the base IP address.
 * * For example, "123.45.67.89/20" is a CIDR block with a prefix length of 20. Any IP address whose binary
 * representation matches 01111011 00101101 0100xxxx xxxxxxxx, where x can be either 0 or 1, is in the set covered by the CIDR block.
 *
 * You are given a start IP address ip and the number of IP addresses we need to cover n. Your goal is to use as
 * few CIDR blocks as possible to cover all the IP addresses in the inclusive range [ip, ip + n - 1] exactly.
 * No other IP addresses outside of the range should be covered.
 *
 * Return the shortest list of CIDR blocks that covers the range of IP addresses.
 * If there are multiple answers, return any of them.
 *
 * [URL](https://leetcode.com/problems/ip-to-cidr/)
 */
object IPtoCIDR {
    fun ipToCIDR(ip: String, n: Int): List<String> {
        var curr = ipToLong(ip)

        val result = ArrayList<String>()
        var n = n.toLong()

        while (n > 0) {
            var step = curr and -curr
            if (step == 0L) {
                step = 1L
                while (step < n) {
                    step *= 2
                }
            }
            while (step > n) {
                step /= 2
            }

            result.add(longToIp(curr, step))
            curr += step
            n -= step
        }

        return result
    }

    private fun ipToLong(ip: String): Long {
        var curr = 1
        var result = 0L

        for (s in ip.split('.').reversed()) {
            result += (s.toLong() * curr)
            curr *= 256
        }

        return result
    }

    private fun longToIp(ip: Long, step: Long): String {
        var ip = ip
        val ip4 = ip and 255
        ip = ip shr 8
        val ip3 = ip and 255
        ip = ip shr 8
        val ip2 = ip and 255
        ip = ip shr 8
        val ip1 = ip and 255

        var length = 33
        var step = step
        while (step > 0) {
            length--
            step /= 2
        }

        return "$ip1.$ip2.$ip3.$ip4/$length"
    }
}
