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
/*
i	nextUgly (Min of next2, next3, next5)	Ugly List Update	p2	p3	p5	New next2, next3, next5
1	2 (Min of 2, 3, 5)	[1, 2]	1	0	0	4, 3, 5
2	3 (Min of 4, 3, 5)	[1, 2, 3]	1	1	0	4, 6, 5
3	4 (Min of 4, 6, 5)	[1, 2, 3, 4]	2	1	0	6, 6, 5
4	5 (Min of 6, 6, 5)	[1, 2, 3, 4, 5]	2	1	1	6, 6, 10
5	6 (Min of 6, 6, 10)	[1, 2, 3, 4, 5, 6]	3	2	1	8, 9, 10
6	8 (Min of 8, 9, 10)	[1, 2, 3, 4, 5, 6, 8]	4	2	1	10, 9, 10
7	9 (Min of 10, 9, 10)	[1, 2, 3, 4, 5, 6, 8, 9]	4	3	1	10, 12, 10
8	10 (Min of 10, 12, 10)	[1, 2, 3, 4, 5, 6, 8, 9, 10]	5	3	2	12, 12, 15
9	12 (Min of 12, 12, 15)	[1, 2, 3, 4, 5, 6, 8, 9, 10, 12]	6	4	2	16, 15, 15
*/