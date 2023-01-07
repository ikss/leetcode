package arrays.medium

/**
 * There are n gas stations along a circular route, where the amount of gas at the ith station is `gas[i]`.
 *
 * You have a car with an unlimited gas tank and it costs `cost[i]` of gas to travel from the ith station
 * to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.
 *
 * Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit
 * once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique
 *
 * [URL](https://leetcode.com/problems/gas-station/)
 */
object GasStation {
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        if (gas.sum() < cost.sum()) return -1
        var remainsGas = 0
        var start = 0

        for (i in gas.indices) {
            remainsGas += gas[i] - cost[i]

            if (remainsGas < 0) {
                start = i + 1
                remainsGas = 0
            }
        }
        return start
    }
}
