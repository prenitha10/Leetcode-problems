class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())
            return false;
        char[] ch=word1.toCharArray();
        char[] ch2=word2.toCharArray();
        HashMap<Character,Integer> hmap=new HashMap<>();
        HashMap<Character,Integer> hmap2=new HashMap<>();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=0;i<word1.length();i++)
        {
            hmap.put(ch[i],hmap.getOrDefault(ch[i],0)+1);
            hmap2.put(ch2[i],hmap2.getOrDefault(ch2[i],0)+1);
        }
        for(int ele:hmap.values())
            list.add(ele);
        Collections.sort(list);
        for(int ele:hmap2.values())
            list2.add(ele);
        Collections.sort(list2);
        for(int i=0;i<word1.length();i++)
        {
            if(!word2.contains(String.valueOf(ch[i])) )
                return false;
        }
        if(!list.equals(list2))
            return false;
        return true;
    }
}