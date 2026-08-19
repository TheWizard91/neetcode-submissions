class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # if len(s) != len(t):
        #     return False
        # ms={chars: s.count(chars) for chars in s}
        # mt={chart: s.count(chart) for chart in t}
        mt={}
        ms={}
        for i in s:
            ms[i] = ms.get(i, 0) + 1
        for j in t:
            mt[j] = mt.get(j, 0) + 1
            
        if ms.keys() != mt.keys() or ms.items() != mt.items():
            return False
        return True
        