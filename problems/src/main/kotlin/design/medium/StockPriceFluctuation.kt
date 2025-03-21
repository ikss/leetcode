package design.medium

import java.util.*

/**
 * You are given a stream of records about a particular stock. Each record contains a timestamp and the corresponding
 * price of the stock at that timestamp.
 *
 * Unfortunately due to the volatile nature of the stock market, the records do not come in order. Even worse,
 * some records may be incorrect. Another record with the same timestamp may appear later in the stream correcting the
 * price of the previous wrong record.
 *
 * Design an algorithm that:
 * * Updates the price of the stock at a particular timestamp, correcting the price from any previous records at the timestamp.
 * * Finds the latest price of the stock based on the current records. The latest price is the price at the latest timestamp recorded.
 * * Finds the maximum price the stock has been based on the current records.
 * * Finds the minimum price the stock has been based on the current records.
 *
 * Implement the StockPrice class:
 * * StockPrice() Initializes the object with no price records.
 * * void update(int timestamp, int price) Updates the price of the stock at the given timestamp.
 * * int current() Returns the latest price of the stock.
 * * int maximum() Returns the maximum price of the stock.
 * * int minimum() Returns the minimum price of the stock.
 *
 * [URL](https://leetcode.com/problems/stock-price-fluctuation/)
 */
object StockPriceFluctuation {
    class StockPrice() {
        private var timestampToPrice = HashMap<Int, Int>()
        private var priceFreq = TreeMap<Int, Int>()
        private var latestTimestamp = 0

        fun update(timestamp: Int, price: Int) {
            latestTimestamp = maxOf(latestTimestamp, timestamp)

            if (timestamp in timestampToPrice) {
                val oldPrice = timestampToPrice[timestamp]!!
                priceFreq[oldPrice] = priceFreq[oldPrice]!! - 1

                if (priceFreq[oldPrice] == 0) {
                    priceFreq.remove(oldPrice)
                }
            }

            timestampToPrice[timestamp] = price
            priceFreq[price] = priceFreq.getOrDefault(price, 0) + 1
        }

        fun current(): Int {
            return timestampToPrice[latestTimestamp]!!
        }

        fun maximum(): Int {
            return priceFreq.lastKey()
        }

        fun minimum(): Int {
            return priceFreq.firstKey()
        }
    }
}