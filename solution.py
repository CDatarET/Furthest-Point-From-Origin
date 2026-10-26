class Solution:
    def furthestDistanceFromOrigin(self, moves: str) -> int:
        disp = 0
        us = 0
        for c in moves:
            if c == 'L':
                disp -= 1
            elif c == 'R':
                disp += 1
            else:
                us += 1
        
        return abs(disp) + us
