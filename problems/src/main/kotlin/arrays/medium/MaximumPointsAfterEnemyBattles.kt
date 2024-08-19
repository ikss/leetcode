package arrays.medium

/**
 * You are given an integer array enemyEnergies denoting the energy values of various enemies.
 *
 * You are also given an integer currentEnergy denoting the amount of energy you have initially.
 *
 * You start with 0 points, and all the enemies are unmarked initially.
 *
 * You can perform either of the following operations zero or multiple times to gain points:
 *
 * * Choose an unmarked enemy, i, such that `currentEnergy >= enemyEnergies[i]`. By choosing this option:
 * * * You gain 1 point.
 * * * Your energy is reduced by the enemy's energy, i.e. `currentEnergy = currentEnergy - enemyEnergies[i]`.
 * * If you have at least 1 point, you can choose an unmarked enemy, i. By choosing this option:
 * * * Your energy increases by the enemy's energy, i.e. `currentEnergy = currentEnergy + enemyEnergies[i]`.
 * * * The enemy i is marked.
 *
 * Return an integer denoting the maximum points you can get in the end by optimally performing operations.
 *
 * [URL](https://leetcode.com/problems/maximum-points-after-enemy-battles/)
 */
object MaximumPointsAfterEnemyBattles {
    fun maximumPoints(enemyEnergies: IntArray, currentEnergy: Int): Long {
        var moved = currentEnergy
        val min = enemyEnergies.min()
        
        if (min > currentEnergy) {
            return 0L
        }

        var result = 0L
        for (e in enemyEnergies) {
            val sum = moved + e
            result += sum / min
            moved = sum % min
        }
        return result - 1
    }
}
