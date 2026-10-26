class Solution {
public:
    int furthestDistanceFromOrigin(string moves) {
        int disp = 0;
        int us = 0;
        for(int i = 0; i < moves.size(); i++){
            if(moves[i] == 'L') disp--;
            else if(moves[i] == 'R') disp++;
            else us++;
        }

        return abs(disp) + us;
    }
};
