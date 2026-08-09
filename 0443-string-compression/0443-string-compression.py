class Solution:
    def compress(self, chars: List[str]) -> int:
        count=0
        first=0
        sec=0
        emptyStr=""
        i=0
        while first<=sec:
            if chars[first]==chars[sec]:
                count+=1
                sec+=1
                if sec== len(chars):
                    if count >1:
                        emptyStr+=chars[first]+str(count)
                    else:
                        emptyStr+=chars[first]
                    break
            else:
                if count >1:
                    emptyStr+=chars[first]+str(count)
                else:
                    emptyStr+=chars[first]
                count=0
                if sec < len(chars):
                    first=sec
                else:
                    break
        chars[:]=list(emptyStr)
        return len(chars)