***
here simple approach is to count whether the no of element type alphbet s is present in magazine in larger amount the ransomnote
if not simply return false
if yes return true
***

class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        for s in ransomNote:
            if ransomNote.count(s)>magazine.count(s):
                return False;
        return True;
