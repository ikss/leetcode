package arrays.medium

/**
 * You are given a 0-indexed integer array players, where `players[i]` represents the ability of the ith player.
 * You are also given a 0-indexed integer array trainers, where `trainers[j]` represents the training capacity of the jth trainer.
 *
 * The ith player can match with the jth trainer if the player's ability is less than or equal to the trainer's
 * training capacity. Additionally, the ith player can be matched with at most one trainer, and the jth trainer can be
 * matched with at most one player.
 *
 * Return the maximum number of matchings between players and trainers that satisfy these conditions.
 *
 * [URL](https://leetcode.com/problems/maximum-matching-of-players-with-trainers/)
 */
object MaximumMatchingOfPlayersWithTrainers {
    fun matchPlayersAndTrainers(players: IntArray, trainers: IntArray): Int {
        players.sort()
        trainers.sort()

        var result = 0

        var currTrainer = 0
        var currPlayer = 0
        while (currPlayer < players.size && currTrainer < trainers.size) {
            if (players[currPlayer] > trainers[currTrainer]) {
                currTrainer++
                continue
            }
            result++
            currTrainer++
            currPlayer++
        }

        return result
    }
}
