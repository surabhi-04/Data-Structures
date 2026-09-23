class Solution:
    def maxArea(self, a: List[int]) -> int:
        
        water=[]
        i=0
        j=len(a)-1

        while i<j:
            curr=(min(a[i],a[j]))*(j-i)
            water.append(curr)
            if(a[i]>a[j]):
                j=j-1
            else:
                i=i+1
        
        # print(water)
        return max(water)     