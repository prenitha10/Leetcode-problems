class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int d=capacity;
        int count=0;
        for(int i=0;i<plants.length;i++)
        {
            if(capacity>=plants[i])
            {
                capacity=capacity-plants[i];
                count+=1;
            }
            else
            {
                capacity=d-plants[i];
                count+=2*i+1;
            }
        }
        return count;
    }
}