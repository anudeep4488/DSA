class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int points=0;
        for(int i=0;i<operations.length;i++){
            String temp=operations[i];
            if(temp.equals("X++")||temp.equals("++X")){
                points+=1;
            }
            else{
                points-=1;
            }
        }
        return points;
    }
}