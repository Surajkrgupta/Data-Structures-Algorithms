class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        res = []
        n = len(grid[0])
        size = n * n
        freq = [0] * (size + 1)
        a=b=0
        for r in grid:
            for num in r:
                freq[num]+=1

        for num in range(1,size+1):
            if freq[num]==2:
                a=num
            if freq[num]==0:
                b=num
        
        return [a,b]
