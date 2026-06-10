class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        Map<String,List<String>> map=new HashMap<>();

        for(String s:strs){
            int arr[]=new int[26];
            for(char ch:s.toCharArray()){
                arr[ch-'a']++;
            }

            String key=Arrays.toString(arr);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
