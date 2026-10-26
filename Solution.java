class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int disp = 0;
        int us = 0;
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'L'){
                disp--;
            }
            else if(moves.charAt(i) == 'R'){
                disp++;
            }
            else{
                us++;
            }
        }

        return Math.abs(disp) + us;
    }
}
