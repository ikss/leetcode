package medium

/**
 * There is an ATM machine that stores banknotes of 5 denominations: 20, 50, 100, 200, and 500 dollars.
 * Initially the ATM is empty. The user can use the machine to deposit or withdraw any amount of money.
 *
 * When withdrawing, the machine prioritizes using banknotes of larger values.
 *
 * For example, if you want to withdraw $300 and there are 2 $50 banknotes, 1 $100 banknote, and 1 $200 banknote,
 * then the machine will use the $100 and $200 banknotes.
 * However, if you try to withdraw $600 and there are 3 $200 banknotes and 1 $500 banknote, then the withdraw request
 * will be rejected because the machine will first try to use the $500 banknote and then be unable to use banknotes to complete the remaining $100. Note that the machine is not allowed to use the $200 banknotes instead of the $500 banknote.
 * Implement the ATM class:
 * * ATM() Initializes the ATM object.
 * * void deposit(int[] banknotesCount) Deposits new banknotes in the order $20, $50, $100, $200, and $500.
 * * int[] withdraw(int amount) Returns an array of length 5 of the number of banknotes that will be handed to the user
 * in the order $20, $50, $100, $200, and $500, and update the number of banknotes in the ATM after withdrawing.
 * Returns [-1] if it is not possible (do not withdraw any banknotes in this case).
 *
 * [URL](https://leetcode.com/problems/design-an-atm-machine/)
 */
object DesignAnATMMachine {
    class ATM() {
        private val storageMapping = intArrayOf(20, 50, 100, 200, 500)
        private val storage = IntArray(5) // 20, 50, 100, 200, 500

        fun deposit(banknotesCount: IntArray) {
            for (i in banknotesCount.indices) {
                storage[i] += banknotesCount[i]
            }
        }

        fun withdraw(amount: Int): IntArray {
            var amount = amount
            val withdrawal = IntArray(5)

            for (i in 4 downTo 0) {
                val currNote = storageMapping[i]
                val currCount = storage[i]
                if (amount >= currNote && currCount > 0) {
                    val count = minOf(amount / currNote, currCount)

                    amount -= count * currNote
                    withdrawal[i] += count
                }
            }

            if (amount != 0) return intArrayOf(-1)

            for (i in withdrawal.indices) {
                storage[i] -= withdrawal[i]
            }

            return withdrawal
        }

    }
}