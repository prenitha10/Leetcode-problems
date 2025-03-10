class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        LinkedHashMap<Integer,ArrayList<Integer>> hmap=new LinkedHashMap<>();
        int row=mat.length-1;
        int col=mat[0].length-1;
        ArrayList<Integer> newarr=new ArrayList<>();
        for(int i=0;i<=row;i++)
        {
            for(int j=0;j<=col;j++)
            {
                hmap.putIfAbsent(i+j,new ArrayList<>());
                hmap.get(i+j).add(mat[i][j]);

            }
        }
        for(Map.Entry<Integer,ArrayList<Integer>> entry:hmap.entrySet())
        {
            if(entry.getKey()%2==0)
            {
                Collections.reverse(entry.getValue());
            }
            newarr.addAll(entry.getValue());
        }       
        return newarr.stream().mapToInt(i -> i).toArray();
    }
}