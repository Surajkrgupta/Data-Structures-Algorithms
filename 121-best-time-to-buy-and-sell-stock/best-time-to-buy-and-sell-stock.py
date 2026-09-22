class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        buy = prices[0]
        maxProfit=0
        for n in prices:
            if buy > n:
                buy=n
            else:
                maxProfit=max(maxProfit,n-buy)
        
        return maxProfit

        