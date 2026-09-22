class Solution:
    def myPow(self, x: float, n: int) -> float:
        return self.solve(x,n)
    
    def solve(self,x:float,n:int) -> float:
        if n==0: return 1
        if n<0: return self.solve(1/x,-n)
        elif n%2==0: return self.solve(x*x,n/2)
        else: return x*self.solve(x*x,(n-1)/2)

        