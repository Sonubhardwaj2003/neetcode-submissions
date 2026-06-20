class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int pre[]=new int[words.length];
        int val=0;
        for(int i=0;i<words.length;i++){
            if(vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length()-1))){
                val++;
            }
            pre[i]=val;
        }

        int n=queries.length;
        int ans[]=new int[n];
        int i=0;
        for(int[] arr:queries){
            if(arr[0]==0){
                ans[i]=pre[arr[1]];
            }else{
                ans[i]=pre[arr[1]]-pre[arr[0]-1];
            }
            i++;
        }

        return ans;
    }
}