class Solution:
    def firstUniqChar(self, s: str) -> int:
        i=0;
        for l in s:
            if s.count(l)==1:
                return i
            i=i+1;
        return -1
