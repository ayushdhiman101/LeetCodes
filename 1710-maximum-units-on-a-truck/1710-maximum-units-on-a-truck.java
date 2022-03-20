class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes, (a,b) -> Integer.compare(a[1], b[1]));
        
        int numberOfBoxes = 0;
        int numberOfUnits = 0;
        for (int i =boxTypes.length-1; i>=0; i--){
            int numOfBoxexToPut = truckSize - numberOfBoxes;
            if(numOfBoxexToPut > boxTypes[i][0])
            {
                numberOfUnits = numberOfUnits +  boxTypes[i][0]*boxTypes[i][1];
                numberOfBoxes = numberOfBoxes + boxTypes[i][0];
            }
            else{
              numberOfUnits = numberOfUnits +  numOfBoxexToPut*boxTypes[i][1];
                break;
            }
                
        }
        return numberOfUnits;
    }
}