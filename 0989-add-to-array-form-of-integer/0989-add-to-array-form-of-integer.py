class Solution:
    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        n1 = int(''.join(map(str,num)))
        print(n1)
        ans = n1 + k
        res = [int(x) for x in str(ans)]
        return res