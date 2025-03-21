class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly=new int[n];
        ugly[0]=1;
        int i2=0;
        int i3=0;
        int i5=0;
        int next2=2;
        int next3=3;
        int next5=5;
        int nextnum=0;
        for(int i=1;i<ugly.length;i++)
        {
            nextnum=Math.min(next2,Math.min(next3,next5));
            ugly[i]=nextnum;
            if(nextnum==next2)
            {
                i2++;
                next2=ugly[i2]*2;
            }
            if(nextnum==next3)
            {
                i3++;
                next3=ugly[i3]*3;
            }
            if(nextnum==next5)
            {
                i5++;
                next5=ugly[i5]*5;
            }
        }
        return ugly[n-1];        
    }
}