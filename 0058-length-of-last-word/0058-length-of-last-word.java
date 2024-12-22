class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        s=s.trim();
        String[] arr=s.split(" ");
        int n=arr.length-1;
        return arr[n].length();
        
    }
}