class Solution:
    def countBits(self, n: int) -> List[int]:
        cntList = []
        
        for i in range(n + 1):
            cntList.append(bin(i).count("1"))
        return cntList